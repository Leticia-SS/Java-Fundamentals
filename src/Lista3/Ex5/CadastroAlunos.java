package Lista3.Ex5;

public class CadastroAlunos {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Lucas", new double[] {7.5, 8, 9.6});
        Aluno aluno1 = new Aluno("Andrew", new double[] {7, 6.8, 6});
        Aluno aluno2 = new Aluno("Steph", new double[] {5, 8.7, 9});
        Aluno aluno3 = new Aluno("Hugo", new double[] {5.7, 8, 9.1});
        Aluno aluno4 = new Aluno("Lara", new double[] {9.7, 5.8, 5});

        Aluno[] turma = {aluno, aluno1, aluno2, aluno3, aluno4};
        int somaDasMedias = 0;
        for(Aluno alunos: turma){
            somaDasMedias += alunos.calcularMedia();
            alunos.exibirInfos();
        }

        double mediaDaTurma = somaDasMedias / turma.length;
        System.out.printf("A media da turma é %.2f", mediaDaTurma);
    }
}
