package Lista2;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        long fibonacci = input.nextLong();

        long a=0, b=0;
        for (int i = 0; i < fibonacci; i++){
            System.out.printf("%d ,", a);
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
