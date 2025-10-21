package TemplateMethod;

public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT( 3000);

        System.out.println("Salario Liquido CLT: " + f1.calcSalarioLiquido());
        Funcionario f2 = new FuncionarioPublico( 8000);

        System.out.println("Salario Liquido Servidor Público: " + f2.calcSalarioLiquido());
        Funcionario f3 = new FuncionarioPJ( 16000);

        System.out.println("Salario Liquido PJ: " + f3.calcSalarioLiquido());
    }
}
