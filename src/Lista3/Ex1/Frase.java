package Lista3.Ex1;

public class Frase {
    String texto;

    public int counterCharacters() {
        int counter = 0;
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.toUpperCase()).charAt(i) == 'A') {
                counter++;
            }
        }
        return counter;
    }
    public int countOccurencies(String character){
        int counter = 0;

        return 0;
    }
}
