package Lista2;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para imprimir a tabuada dele");
        int number = input.nextInt();

        for (int i = 0; i<=10; i++){
            int result = number * i;
            System.out.printf("%d X %d = %d\n", number, i, result);
        }
    }
}
