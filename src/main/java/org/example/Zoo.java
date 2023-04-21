package org.example;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animalArrayList = new ArrayList<>();

    public void addAnimalToArrayList(Animal animal) {
        this.animalArrayList.add(animal);
    }

    public void printAnimalList() {
        for (Animal animal : this.animalArrayList) {
            System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalArrayList=" + animalArrayList +
                '}';
    }
}
