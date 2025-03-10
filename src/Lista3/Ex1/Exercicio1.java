package Lista3.Ex1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma frase");
        String frase = input.nextLine();

        int counter = 0;
        for(int i = 0; i< frase.length(); i++){
            if((frase.toUpperCase()).charAt(i) == 'A'){
                counter++;
            }
        }

        System.out.printf("A letra \'a\' aparece %d vezes\n", counter);

        if(frase.toLowerCase().startsWith("java")){
            System.out.println("A frase começa com Java");
        } else {
            System.out.println("Afrase não começa com Java");
        }

//        System.out.println("==========================");
//        Frase frase1 = new Frase();
//        frase1.texto = frase;
//        String fraseTrocada =


    }
}
