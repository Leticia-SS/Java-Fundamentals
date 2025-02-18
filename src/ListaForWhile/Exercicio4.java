package ListaForWhile;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n = input.nextInt();

        System.out.println("Digite o segundo número");
        int z = input.nextInt();

        while(z >= n){
            System.out.printf("%d", z--);
        }
        while(n >= z){
            System.out.printf("%d", n--);
        }

    }
}
