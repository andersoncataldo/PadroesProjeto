package SRP;

import java.util.ArrayList;
import java.util.List;

public class TurmaDado {

    List<Aluno> listaDados = new ArrayList<Aluno>();

    public List<Aluno> load() {
        return listaDados;
    }
    public void save(Aluno a) {
        listaDados.add(a);
    }
    public void update(String matricula, Aluno alunoAtualizado) {
        for(int i = 0; i<listaDados.size(); i++) {
            Aluno aluno = listaDados.get(i);
            if(aluno.getMatricula().equals(matricula)) {
                listaDados.set(i, alunoAtualizado);
            }
        }
    }
    public void delete(Aluno a) {
        listaDados.remove(a);
    }
}