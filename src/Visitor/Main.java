package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("BMW"));
        veiculos.add(new Onibus("Mercedes"));
        veiculos.add(new Bicicleta("Caloi"));
        Visitor v = new PrintVisitor();


        for(Veiculo veiculo : veiculos) {
            veiculo.accept(v);
        }
    }
}