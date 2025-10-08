package SRP;

public class TurmaView {
    public void MostrarDados(Turma turma) {
        System.out.println("Total de alunos: "+turma.getTotalAlunos());
        System.out.println("Média da turma: " + turma.calcularMedia());
    }
    public void ImprimeDados(Turma turma) {
        System.out.println("=== Dados da Turma ===");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("----------------------");
        }
    }
}
