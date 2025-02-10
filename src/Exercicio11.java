import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1, x2;

        System.out.println("Equação do segundo grau ax^2 + bx + c");
        System.out.println("Digite o valor de a");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de b");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de c");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if(delta<0) System.out.println("Equação não possui raizes reais");
        else if (delta == 0){
            x1 = -b / (2 * a);
            System.out.println("Raíz X: "+ x1);
        } else{
            x1 = (-b + (int) Math.sqrt(delta)) / (2 * a);
            x2 = (-b + (int) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raizes: \nX1: " + x1 + "\nX2:" + x2);
        }

    }
}
