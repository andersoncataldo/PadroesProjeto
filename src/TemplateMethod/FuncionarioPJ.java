package TemplateMethod;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(double salario) {
        super(salario);
    }

    public double calcDescontoPrev() {
        return this.getSalario() * 0.06;
    }

    public double calcDescontoPlanSaude() {
        return this.getSalario() * 0;
    }

    public double calcOutrosDescontos() {
        double ISS = this.getSalario() * 0.02;
        double CLSS = this.getSalario() * 0.01;
        double IRPJ = this.getSalario() * 0.15;
        return ISS + CLSS + IRPJ;
    }

    public double calcSalarioLiquido() {
        return super.calcSalarioLiquido();
    }
}
