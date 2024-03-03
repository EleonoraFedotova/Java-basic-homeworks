package ru.fedotova.java.basic.homeworks.homeworks6;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            System.out.println(name + " поел(а) и наелся(ась).");
            satiety = true;
        } else {
            System.out.println(name + " не смог(ла) поесть из-за недостатка еды в тарелке.");
        }
    }

    public void info() {
        System.out.println(name + ": аппетит - " + appetite + ", сытость - " + satiety);
    }
}