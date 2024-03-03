package ru.fedotova.java.basic.homeworks.homeworks6;

class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if (currentFood + amount <= maxFood) {
            currentFood += amount;
            System.out.println("Добавлено " + amount + " еды в тарелку.");
        } else {
            System.out.println("Нельзя добавить такое количество еды, тарелка переполнится.");
        }
    }

    public boolean decreaseFood(int amount) {
        if (currentFood >= amount) {
            currentFood -= amount;
            return true;
        } else {
            System.out.println("Недостаточно еды в тарелке.");
            return false;
        }
    }

    public void info() {
        System.out.println("Тарелка: максимальное количество еды - " + maxFood + ", текущее количество еды - " + currentFood);
    }
}