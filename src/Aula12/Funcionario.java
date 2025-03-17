package Aula12;

public class Funcionario {
    private String Nome;
    private String cpf;
    private double Salario;
    protected int doubleqlqCoida;


    public String getName() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Nome;
    }

    private void satyHello() {
        System.out.println("Ola");
    }

    public double getBonificacao() {
        return this.getSalario() * 0.05;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }


}
