package org.example;

abstract class Animal {
    protected String name;
    protected int age;
    private DietType dietType;


    public Animal(String name, int age, DietType dietType) {
        this.name = name;
        this.age = age;
        this.dietType = dietType;
    }

    public abstract int calculateSpeed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + name +
                ", diet type = " + dietType +
                ", age = " + age +
                ", speed = " + calculateSpeed() +
                '}';
    }
}
