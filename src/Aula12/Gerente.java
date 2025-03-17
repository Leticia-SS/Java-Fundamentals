package Aula12;

// Classe gerende Herda classe funcionario, não necessitando repetir variaveis
public class Gerente extends Funcionario {
//    private String Nome;
//    private String cpf;
//    private double salario;
    private int senha;
    private int numeroDeFuncionarios;
    private String Setor;

    public int getSenha() {
        this.doubleqlqCoida = 100;
        return this.senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.getSalario() * 0.10;
    }
}
