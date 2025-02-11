import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner reading = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        double grade = reading.nextDouble();

        if(grade >= 7 && grade <= 10){
            System.out.println("Passou direto");
        } else if(grade < 7 && grade >=5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
