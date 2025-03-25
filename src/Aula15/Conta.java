package Aula15;

public class Conta {
    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }
    public void sacar(float valor){
        if (getSaldo() - valor < 0){
            throw new IllegalArgumentException();
        }
        this.saldo -= valor;
    }
    public float getSaldo() {
        return saldo;
    }
}
