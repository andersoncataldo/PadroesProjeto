package Observer;

public class TermometroKelvin implements Observer {

    public void update(Subject s){
        double temp = ((Temperatura) s).getTemp();
        double kelvinTemp = temp + 273.15;
        System.out.println("Kelvin temperatura: " + kelvinTemp);
    }
}
