package Aula7;

public class CarroTester {
    public static void main(String[] args){
        int anything = 5;
        boolean anyBoolean = false;
        double anyDouble = 5.32D;

        Carro golf = new Carro();
        golf.isFlex = false;
        golf.tankCapacity = 56;
        golf.kmPerLitters = 7;
        golf.passengerQuantity = 5;
        golf.model = "Golf GTI";
        golf.breaking();
        golf.accelerating();
        golf.carCounter = 1;
        System.out.println(golf.isFlex);
        System.out.println(golf.passengerQuantity);
        System.out.println(golf.carCounter);

        Carro porshe = new Carro();
        porshe.isFlex = true;
        porshe.tankCapacity = 62;
        porshe.kmPerLitters = 5;
        porshe.passengerQuantity = 5;
        porshe.model = "Porshe";
        porshe.breaking();
        porshe.accelerating();
        porshe.carCounter++;

        System.out.println(porshe.isFlex);
        System.out.println(porshe.passengerQuantity);
        System.out.println(porshe.carCounter);
    }
}
