package ru.fedotova.java.basic.homeworks.homeworks5;

public abstract class Animal {
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


    public void info() {
        System.out.println(name + ": выносливость = " + stamina);
    }

    public abstract double swim(int distance);
}

class Cat extends Animal {
    public Cat(String name, double speed, int stamina) {
        super(name, speed, 0, stamina);
    }
    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }
}

class Dog extends Animal {
    public Dog(String name, double speed, double swimSpeed, int stamina) {
        super(name, speed, swimSpeed, stamina);
    }
    @Override
    public double swim(int distance) {
        if (stamina >= 2 * distance) {
            stamina -= 2 * distance;
            return distance / swimSpeed;
        } else {
            System.out.println(name + " устал(а) и не может проплыть такое расстояние.");
            return -1;
        }
    }
}

class Horse extends Animal {
    public Horse(String name, double speed, double swimSpeed, int stamina) {
        super(name, speed, swimSpeed, stamina);
    }
    @Override
    public double swim(int distance) {
        if (this instanceof Horse && stamina >= 4 * distance) {
            stamina -= 2 * distance;
            return distance / swimSpeed;
        } else {
            System.out.println(name + " устал(а) и не может проплыть такое расстояние.");
            return -1;
        }
    }
}


