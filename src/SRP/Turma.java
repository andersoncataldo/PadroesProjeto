package SRP;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> ListaAlunos = new ArrayList<>();

    public Turma() {

    }

    public double calcularMedia() {
        double soma = 0;
        for(Aluno aluno : ListaAlunos) {
            soma += aluno.getNota();
        }
        return soma / ListaAlunos.size();
    }

    public List<Aluno> getAlunos() {
        return ListaAlunos;
    }

    public int getTotalAlunos() {
        int tamanho = ListaAlunos.size();
        return tamanho;
    }

    public Aluno add(Aluno a) {
        ListaAlunos.add(a);
        return a;
    }
    public void delete(Aluno a) {
        ListaAlunos.remove(a);
    }

}