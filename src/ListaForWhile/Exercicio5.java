package ListaForWhile;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número maior que 1");
        int num = input.nextInt();

        int counter = 1;
        while(counter <= num){
            System.out.printf("%d\n", counter++);
        }
    }
}
