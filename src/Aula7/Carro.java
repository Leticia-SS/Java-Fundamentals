package Aula7;

public class Carro {
    int kmPerLitters;
    int passengerQuantity;
    int tankCapacity;
    boolean isFlex;
    String model;
    int carCounter;

    void accelerating(){
        System.out.printf("Acelerando o %s\n", model);
    }

    void breaking() {
        System.out.printf("Freiando o %s\n", model);
    }
}
