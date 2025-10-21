package Observer;

public class Temperatura extends Subject{
    private double temp;

    public Temperatura(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyObservers();
    }
}