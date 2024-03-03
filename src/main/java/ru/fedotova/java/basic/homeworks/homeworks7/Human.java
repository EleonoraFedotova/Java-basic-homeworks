package ru.fedotova.java.basic.homeworks.homeworks7;

enum TerrainType {
    DENSE_FOREST,
    PLAIN,
    SWAMP
}

class Human {
    String name;
    Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public boolean sitOnTransport(Transport transport) {
        if (transport.canCarry(this) && currentTransport == null) {
            currentTransport = transport;
            System.out.println(name + " сел(а) на " + transport.getType());
            return true;
        } else {
            System.out.println(name + " не может сесть на " + transport.getType());
            return false;
        }
    }

    public boolean getOffTransport() {
        if (currentTransport != null) {
            System.out.println(name + " встал(а) с " + currentTransport.getType());
            currentTransport = null;
            return true;
        } else {
            System.out.println(name + " не находится на транспорте");
            return false;
        }
    }

    public boolean move(int distance, TerrainType terrainType) {
        if (currentTransport != null) {
            boolean success = currentTransport.move(distance, terrainType);
            if (success) {
                System.out.println(name + " переместился(лась) на " + distance + " метров на " + currentTransport.getType());
            } else {
                System.out.println(name + " не удалось переместиться на " + distance + " метров на " + currentTransport.getType() +
                        " из-за ограничений местности");
            }
            return success;
        } else {
            System.out.println(name + " переместился(лась) на " + distance + " метров пешком");
            return true;
        }
    }
}

abstract class Transport {
    private final String type;

    public Transport(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract boolean move(int distance, TerrainType terrainType);

    public abstract boolean canCarry(Human human);
}

class Car extends Transport {
    private int fuel;

    public Car(int fuel) {
        super("Автомобиль");
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.DENSE_FOREST || terrainType == TerrainType.SWAMP) {
            System.out.println("Автомобиль не может переместиться по данной местности");
            return false;
        }

        if (fuel >= distance) {
            fuel -= distance;
            return true;
        } else {
            System.out.println("Недостаточно топлива для перемещения на " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean canCarry(Human human) {
        return true;
    }
}

class Horse extends Transport {
    private int energy;

    public Horse(int energy) {
        super("Лошадь");
        this.energy = energy;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Лошадь не может переместиться по болоту");
            return false;
        }

        if (energy >= distance) {
            energy -= distance;
            return true;
        } else {
            System.out.println("Недостаточно сил для перемещения на " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean canCarry(Human human) {
        return true;
    }
}

class Bicycle extends Transport {
    private int riderEnergy;

    public Bicycle(int riderEnergy) {
        super("Велосипед");
        this.riderEnergy = riderEnergy;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Велосипед не может переместиться по болоту");
            return false;
        }

        if (riderEnergy >= distance) {
            riderEnergy -= distance;
            return true;
        } else {
            System.out.println("Недостаточно сил водителя для перемещения на " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean canCarry(Human human) {
        return true;
    }
}

class OffRoadVehicle extends Transport {
    public OffRoadVehicle() {
        super("Вездеход");
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        return true;
    }

    @Override
    public boolean canCarry(Human human) {
        return true;
    }
}