package TemplateMethod;

public abstract class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }
    public abstract double calcDescontoPrev();
    public abstract double calcDescontoPlanSaude();
    public abstract double calcOutrosDescontos();

    public double calcSalarioLiquido() {
        double prev = calcDescontoPrev();
        double plano = calcDescontoPlanSaude();
        double outros = calcOutrosDescontos();
        return salario - prev - plano - outros;
    }
    public double getSalario() {
        return salario;
    }
}
