package Lista3.Ex4;

public class Banco {
    public static void main(String[] args){
        ContaBancaria joao = new ContaBancaria("Joao");
        ContaBancaria lara = new ContaBancaria("Lara");
        ContaBancaria steph = new ContaBancaria("Steph");

        joao.sacar(1000);
        lara.depositar(2500);
        steph.sacar(50);
        steph.depositar(250);

        ContaBancaria[] contas = {joao, lara, steph};

//        ajustar
//        for(int i=0;i<contas.length;i++){
//            contas[i].exibirInfo();
//        }

    }
}
