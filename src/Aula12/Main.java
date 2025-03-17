package Aula12;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ControleDeBonificacao contolrBonificacao = new ControleDeBonificacao();

        funcionario.setNome("Leonardo");
        funcionario.setSalario(1000);
        System.out.println(funcionario.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setSenha(123456);
        gerente.doubleqlqCoida = 100;
//        gerente.sayJello2 // Publico acessa de qualquer lugar, Private somente dentro da classe, Protected é a classe e seus filhos
        //Java não possui Herança Multipla
        gerente.setSalario(5000);
        System.out.println("Bonificação do gerente");
        System.out.println(gerente.getBonificacao());

        // Comentário, não aparece no out
        // Anotação é com @
        // @Override

         Funcionario f = new Gerente();
          Gerente g = new Gerente();
//        Funcionario f2 = gerente;




    }
}
