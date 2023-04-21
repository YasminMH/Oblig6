package org.example;

public class Cheetah extends Animal{
    private int spots;

    public Cheetah(String name, int age, int spots) {
        super(name, age, DietType.CARNIVORE);
        this.spots = spots;
    }

    @Override
    public int calculateSpeed() {
        return age + spots + 10;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }
}
