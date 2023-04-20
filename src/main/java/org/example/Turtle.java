package org.example;

public class Turtle extends Animal{
    private int wrinkles;

    public Turtle(String name, int age, DietType dietType, int wrinkles) {
        super(name, age, dietType = DietType.HERBIVORE);
        this.wrinkles = wrinkles;
    }

    @Override
    public int calculateSpeed() {
        return age - wrinkles / 10;
    }

    public int getWrinkles() {
        return wrinkles;
    }

    public void setWrinkles(int wrinkles) {
        this.wrinkles = wrinkles;
    }
}
