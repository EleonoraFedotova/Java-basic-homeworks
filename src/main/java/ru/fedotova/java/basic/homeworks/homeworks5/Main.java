package ru.fedotova.java.basic.homeworks.homeworks5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 10, 20);
        Dog dog = new Dog("Шарик", 15, 5, 50);
        Horse horse = new Horse("Буцефал", 20, 3, 80);

        double runTime = cat.run(50);
        if (runTime != -1) {
            System.out.println(cat.name + " пробежал(а) " + 50 + " м за " + runTime + " сек");
        }

        double swimTime = dog.swim(10);
        if (swimTime != -1) {
            System.out.println(dog.name + " проплыл(а) " + 10 + " м за " + swimTime + " сек");
        }

        horse.info();
    }
}

