package org.example.abstractFactory;

public class VeryCostlyCarFactory implements CarFactory{
    @Override
    public Car manufactureCar() {
        Car car = new Car(100000000L,"8262 CC", 540L);
        car.setExperiance(new LuxaryExperiance());
        return car;
    }
}
