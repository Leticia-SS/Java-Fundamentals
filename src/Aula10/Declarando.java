package Aula10;

public class Declarando {
    public static void main(String[] args){
        int[] meuArray = {1, 2, 3, -6, 123000};
        double[] meuArray2;
        boolean[] meuArray3 = {true, false, false};

        String[] nomes = new String[10];
        int[] notas = new int[100];
//        boolean notas = new boolean[100]; // return False, it fills the memory with 0|0|0|0|..., 0 is False

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);
        System.out.println(meuArray[3]);
//        System.out.println(meuArray[4]); // Array out of bounds
//        System.out.println(meuArray2[1]); // Array not initialized
        System.out.println("---------------------------");
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println("---------------------------");
        System.out.println(nomes[0]);
        System.out.println("Tamanho do Array notas:" + notas.length);

        int[] temperature;
        int[] temperature2 = {1, 2, 3};
        int[] temperature3 = new int[10];

        String[] nomes2 = {"Leo", "Lara", "Daniel"};
        System.out.println(nomes2[1].toUpperCase());

        for(int i = 0; i<nomes2.length;i++){
            nomes2[i] = "Teste"; // It will replace Leo with Teste, the outside print will show 'Teste'
            System.out.println(nomes2[i].toUpperCase());
        }

        System.out.println(nomes2[0]);
    }
}
