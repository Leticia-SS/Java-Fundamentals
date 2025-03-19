package Aula13.empresa;

public abstract class Funcionario {
    private double salario;

    public double getBonificacao(){
        System.out.println("Bonificacao Funcionario");
        return this.salario * 0.10;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
