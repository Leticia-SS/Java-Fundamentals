package Lista2;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número positivo");
        int num = input.nextInt();

        int result = 1;

        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        System.out.printf("Resultado: %d\n", result);
    };
}
