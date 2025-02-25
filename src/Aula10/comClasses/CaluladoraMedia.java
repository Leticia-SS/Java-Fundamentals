package Aula10.comClasses;

public class CaluladoraMedia {
    double calcularMediaAritmetica(Aluno[] alunos){
        // O metodo precisa de todos os parametros para fazer a função dele
        double soma = 0.0;
        for (Aluno temp: alunos){
            soma += temp.nota;
        }
        double media = soma / alunos.length;
        return media;
    }
    // Void não tem retorno
    double[] potenciaQuadrada(Aluno[] alunos){
        double[] potencias = new double[alunos.length];
        int counter = 0;
        for(Aluno temp: alunos){
            potencias[counter] = Math.pow(temp.nota, 2);
            counter ++;
        }
        return potencias;
    }
}
