package org.example.abstractFactory;

public class CostlyCarFactory implements CarFactory{
    @Override
    public Car manufactureCar() {
        Car car = new Car(5000000L,"2262 CC", 340L);
        car.setExperiance(new PremiumExperiance());
        return car;
    }
}
