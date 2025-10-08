package SRP;

//Princípios de Projetos (SRP)
public class Main {
    public static void main(String[] args) {
        Turma Turma = new Turma();
        Aluno Carlo = new Aluno("Carlo", "913345", 100.0);
        Aluno Francesco = new Aluno("Francesco", "345333", 33.5);
        Aluno Lion = new Aluno("Lion", "202504", 60.2);
        Aluno Judas = new Aluno("Judas", "234244", 30.0);

        TurmaView view = new TurmaView();
        Turma.add(Carlo);
        Turma.add(Francesco);
        Turma.add(Lion);
        Turma.delete(Judas);

        view.ImprimeDados(Turma);
        view.MostrarDados(Turma);

        System.out.println(" ");
        System.out.println("Programa finalizado.");
    }
}