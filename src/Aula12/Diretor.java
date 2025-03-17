package Aula12;

public class Diretor {
    private String Nome;
    private String cpf;
    private double Salario;

    public String getName() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Nome;
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

    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
