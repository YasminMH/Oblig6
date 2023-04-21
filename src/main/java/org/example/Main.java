package org.example;

public class Main {
    public static void main(String[] args) {
        Turtle harryTheTurtle = new Turtle("Harry", 90, 15);
        Cheetah billTheCheetah = new Cheetah("Bill", 10, 36);
        Animal fridtjofTheCheetah = new Cheetah("Fridtjof", 23, 50);

        Zoo hopeZoo = new Zoo();

        hopeZoo.addAnimalToArrayList(harryTheTurtle);
        hopeZoo.addAnimalToArrayList(billTheCheetah);
        hopeZoo.addAnimalToArrayList(fridtjofTheCheetah);

        hopeZoo.printAnimalList();
    }
}