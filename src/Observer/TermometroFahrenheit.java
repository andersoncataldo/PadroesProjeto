package Observer;

public class TermometroFahrenheit implements Observer{

    public void update(Subject s){
        double temp = ((Temperatura) s).getTemp();
        temp += 32;
        System.out.println("Fahrenheit temperatura: " + temp);
    }
}