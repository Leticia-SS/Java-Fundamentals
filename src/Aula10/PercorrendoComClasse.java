package Aula10;

public class PercorrendoComClasse {
    public static void main(String[] args){
        String[] alunos = {"Joao", "Pedro", "Bob"};
        for(int i=0; i< alunos.length; i++){
            System.out.println("Nome" + alunos[i]);
        }
        System.out.println("----------------------------");
        for(String aluno: alunos){
            System.out.println("Nome" + aluno.toUpperCase());
        }


    }
}
