package Aula15;

public class ContaTester {
    public static void main(String[] args){
        Conta conta = new Conta(500.60f);
        conta.sacar(300f);
        System.out.println(conta.getSaldo());
//        if(conta.getSaldo() - 450f > 0){
//            conta.sacar(450f)+.-;
//        }
        try {
            conta.sacar(450f);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
//            conta.enviarEmailErroNoSaldo();
        }
    }
}
