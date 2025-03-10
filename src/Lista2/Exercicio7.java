package Lista2;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ditige um número");
        int num = input.nextInt();
//        int original = num;
        int original = Math.abs(num);
        System.out.printf("Math.abs: ", original);
        int counter = 0;
        while(num > 0){
            num /= 10;
            counter++;
        }
        if (counter == 0) counter++;
        System.out.printf("O número %d tem %d dígitos", original, counter);
    }
}
