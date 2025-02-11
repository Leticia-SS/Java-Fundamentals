package Aula6;

public class OperadorIncremento {
    public static void main(String[] args){
        int i = 5;
        int k = 5;

        int resulti = i++;
        int resultk = ++k;

        System.out.println("Valor de i é: " + i);
        System.out.println("Valor de k é: " + k);
        System.out.println("Resultado i: " + resulti);
        System.out.println("Resultado k: " + resultk);
    }
}
