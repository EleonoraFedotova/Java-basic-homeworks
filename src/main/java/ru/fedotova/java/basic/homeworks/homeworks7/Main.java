package ru.fedotova.java.basic.homeworks.homeworks7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50);
        Horse horse = new Horse(30);
        Bicycle bicycle = new Bicycle(40);
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        Human person = new Human("Иван");

        person.sitOnTransport(car);
        person.move(20, TerrainType.PLAIN);
        person.getOffTransport();

        person.sitOnTransport(horse);
        person.move(15, TerrainType.PLAIN);
        person.getOffTransport();

        person.sitOnTransport(bicycle);
        person.move(10, TerrainType.SWAMP);
        person.getOffTransport();

        person.sitOnTransport(offRoadVehicle);
        person.move(30, TerrainType.DENSE_FOREST);
        person.getOffTransport();
    }
}
