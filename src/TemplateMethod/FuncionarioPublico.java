package TemplateMethod;

public class FuncionarioPublico extends Funcionario {

    public FuncionarioPublico(double salario) {
        super(salario);
    }

    public double calcDescontoPrev() {
        return this.getSalario() * 0.01;
    }

    public double calcDescontoPlanSaude() {
        return this.getSalario() * 0.03;
    }

    public double calcOutrosDescontos() {
        return this.getSalario() * 0.05;
    }

    public double calcSuperDesconto() {
        return this.getSalario() * 0.07;
    }

    public double calcSalarioLiquido() {
        double salarioLiquido = super.calcSalarioLiquido();
        double superDesconto = calcSuperDesconto();
        return salarioLiquido - superDesconto;
    }
}
