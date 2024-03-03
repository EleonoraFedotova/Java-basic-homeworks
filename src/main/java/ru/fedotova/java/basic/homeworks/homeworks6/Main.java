package ru.fedotova.java.basic.homeworks.homeworks6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(30);
        plate.addFood(20);

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 5),
                new Cat("Том", 15)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.info();
    }
}
