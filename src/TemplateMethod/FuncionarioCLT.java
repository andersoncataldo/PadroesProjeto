package TemplateMethod;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(double salario) {
        super(salario);
    }

    public double calcDescontoPrev() {
        return this.getSalario() * 0.08;
    }

    public double calcDescontoPlanSaude() {
        return this.getSalario() * 0.02;
    }

    public double calcOutrosDescontos() {
        return this.getSalario() * 0.2;
    }
}
