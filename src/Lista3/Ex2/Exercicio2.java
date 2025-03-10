package Lista3.Ex2;

public class Exercicio2 {
    public static void main(String[] args){
        Livro lotr = new Livro("O Senhor dos Anéis", "J.R.R Tolkien", 1954);
        lotr.exibirInfo();
        Livro hp = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling", 1997);
        Livro bladeRunner = new Livro("Blade Runner", "Philip K.", 2020);

        Livro[] livros = new Livro[3];
        livros[0] = lotr;
        livros[1] = hp;
        livros[2] = bladeRunner;

        Livro[] livro1 = {lotr, hp, bladeRunner};

//        for(int i=0; i<livros.length; i++){
//            livros[i].exibirInfo();
//        }

    }
}
