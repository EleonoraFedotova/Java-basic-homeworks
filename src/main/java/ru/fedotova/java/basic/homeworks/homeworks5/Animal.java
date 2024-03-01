package ru.fedotova.java.basic.homeworks.homeworks5;

public class Animal {
    String name;
    double speed;
    double swimSpeed;
    int stamina;

    public Animal(String name, double speed, double swimSpeed, int stamina) {
        this.name = name;
        this.speed = speed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public double run(int distance) {
        if (stamina >= distance) {
            stamina -= distance;
            return distance / speed;
        } else {
            System.out.println(name + " устал(а) и не может пробежать такое расстояние.");
            return -1;
        }
    }

    public double swim(int distance) {
        if (this instanceof Cat) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        } else if (this instanceof Dog && stamina >= 2 * distance) {
            stamina -= 2 * distance;
            return distance / swimSpeed;
        } else if (this instanceof Horse && stamina >= 4 * distance) {
            stamina -= 4 * distance;
            return distance / swimSpeed;
        } else {
            System.out.println(name + " устал(а) и не может проплыть такое расстояние.");
            return -1;
        }
    }

    public void info() {
        System.out.println(name + ": выносливость = " + stamina);
    }
}

class Cat extends Animal {
    public Cat(String name, double speed, int stamina) {
        super(name, speed, 0, stamina);
    }
}

class Dog extends Animal {
    public Dog(String name, double speed, double swimSpeed, int stamina) {
        super(name, speed, swimSpeed, stamina);
    }
}

class Horse extends Animal {
    public Horse(String name, double speed, double swimSpeed, int stamina) {
        super(name, speed, swimSpeed, stamina);
    }
}


