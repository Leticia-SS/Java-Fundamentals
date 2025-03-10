package Lista3.Ex3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
//        int[] arrayInt = {1,2,5,15,3,28,13,35,7,18};
//        Arrays.sort(arrayInt);
//
//        System.out.println("Menor: " + arrayInt[0]);
//        System.out.println("Maior: " + arrayInt[9]);
//
//        System.out.println(Arrays.toString(arrayInt));

        int[] aleatorios = new int[10];
        Random generator = new Random();

        for(int i = 0; i<aleatorios.length; i++){
            int random = generator.nextInt(100);
//            System.out.println(random);
            aleatorios[i] = random;
        }

        Arrays.sort(aleatorios);
        System.out.println("Menor: " + aleatorios[0]);
        System.out.println("Maior: " + aleatorios[aleatorios.length-1]);
        System.out.println(Arrays.toString(aleatorios));

//        for(int i = 0; i<aleatorios.length; i++){
//            System.out.println(aleatorios[i] + " ");
//        }

    }
}
