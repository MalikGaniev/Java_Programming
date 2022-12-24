package day35_polymorphism.TransportationCar;

import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Swim;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot,AutoPark, Swim {
    @Override
    public void fly() {

    }

    @Override
    public void Swimming() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);

    }
}
