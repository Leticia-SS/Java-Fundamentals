import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência");
        double raio = scanner.nextDouble();
        double pi = 3.141592650;

        double diametro = 2 * raio;
        double comprimento = ( 2 * pi) * raio;
        double area = pi * (raio * raio);

        System.out.printf("Diametro %.3f\n", diametro);
        System.out.printf("Comprimento %.3f\n", comprimento);
        System.out.printf("Área %.3f\n", area);
    }
}
