package ListaForWhile;
import  java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n = input.nextInt();

        System.out.println("Digite o segundo número");
        int z = input.nextInt();

        for (int k = n; k <= z; k++){
            if (k%2 == 0){
                System.out.printf("%d", k);
            }
        }
        for (int i = z; i <= n; i++){
            if (i%2 == 0){
                System.out.printf("%d\n", i);
            }
        }

    }
}
