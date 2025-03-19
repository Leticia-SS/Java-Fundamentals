package Aula13.empresa;

public class Gerente extends Funcionario{
    // Construtor padrão criado pelo java automaticamente
//    public Gerente() {
//    }

    public Gerente(String setor ,double salario) {
//        super(salario);
        System.out.println("Gerente do setor " + setor);
    }


    @Override
    public double getBonificacao() {
        double bonificacaoDoFuncionario = super.getBonificacao();
        return bonificacaoDoFuncionario + 100;
    }
}
