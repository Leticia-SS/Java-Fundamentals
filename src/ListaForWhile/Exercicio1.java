package ListaForWhile;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        int n, z;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        n = input.nextInt();

        System.out.println("Digite a soma do segundo número");
        z = input.nextInt();

        int sum = 0;

        for (int i = n; i <= z; i++) {
            sum += i;
        }
        for (int k = z; k<= n; k++){
            sum += k;
        }

        System.out.printf("Soma entre %d e %d é: %d ", n, z, sum);
    }
}
