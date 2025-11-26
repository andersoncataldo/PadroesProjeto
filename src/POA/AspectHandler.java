package POA;


import java.lang.reflect.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AspectHandler implements InvocationHandler {
    private Object target;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public AspectHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String nomeMetodo = method.getName();

        // Ignora getters simples para não poluir o log
        if (nomeMetodo.startsWith("get")) {
            return method.invoke(target, args);
        }

        // ===== ASPECT: LOGGING (Before) =====
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("\n[LOG " + timestamp + "] Iniciando: " + nomeMetodo);
        if (args != null && args.length > 0) {
            System.out.println("[LOG] Argumentos: " + java.util.Arrays.toString(args));
        }

        // ===== ASPECT: VALIDAÇÃO (Before) =====
        if (args != null && args.length > 0 && args[0] instanceof Double) {
            double valor = (Double) args[0];
            if (valor < 0) {
                throw new IllegalArgumentException("[VALIDAÇÃO] Valores negativos não são permitidos");
            }
            if (valor > 50000) {
                System.out.println("[VALIDAÇÃO] ALERTA: Operação de alto valor detectada: R$ " + valor);
            }
        }

        // ===== ASPECT: AUDITORIA (Around - Before) =====
        if (nomeMetodo.equals("sacar") || nomeMetodo.equals("transferir")) {
            ContaBancaria conta = (ContaBancaria) target;
            System.out.println("[AUDITORIA] Operação sensível detectada: " + nomeMetodo);
            System.out.println("[AUDITORIA] Conta: " + conta.getNumero() + " | Titular: " + conta.getTitular());
            System.out.println("[AUDITORIA] Saldo antes: R$ " + conta.getSaldo());
        }

        // ===== ASPECT: PERFORMANCE (Around - Before) =====
        long inicio = System.currentTimeMillis();

        Object resultado = null;
        try {
            // EXECUTA O MÉTODO ORIGINAL
            resultado = method.invoke(target, args);

            // ===== ASPECT: LOGGING (After Returning) =====
            System.out.println("[LOG] Método " + nomeMetodo + " executado com sucesso");

        } catch (InvocationTargetException e) {
            Throwable causa = e.getCause();

            // ===== ASPECT: LOGGING (After Throwing) =====
            System.err.println("[LOG ERRO] Exceção em " + nomeMetodo + ": " + causa.getMessage());

            throw causa;
        } finally {
            // ===== ASPECT: PERFORMANCE (Around - After) =====
            long fim = System.currentTimeMillis();
            long duracao = fim - inicio;
            System.out.println("[PERFORMANCE] " + nomeMetodo + " executado em " + duracao + "ms");

            // ===== ASPECT: AUDITORIA (Around - After) =====
            if (nomeMetodo.equals("sacar") || nomeMetodo.equals("transferir")) {
                ContaBancaria conta = (ContaBancaria) target;
                System.out.println("[AUDITORIA] Saldo depois: R$ " + conta.getSaldo());
                System.out.println("[AUDITORIA] Operação registrada para conformidade");
            }
        }

        return resultado;
    }
}