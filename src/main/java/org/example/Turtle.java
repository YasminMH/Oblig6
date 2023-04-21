package org.example;

public class Turtle extends Animal{
    private int wrinkles;

    public Turtle(String name, int age,  int wrinkles) {
        super(name, age, DietType.HERBIVORE);
        this.wrinkles = wrinkles;
    }

    @Override
    public int calculateSpeed() {
        int basicSpeed = 10;
        return basicSpeed + ((age - wrinkles) / 10);
    }

    public int getWrinkles() {
        return wrinkles;
    }

    public void setWrinkles(int wrinkles) {
        this.wrinkles = wrinkles;
    }
}
