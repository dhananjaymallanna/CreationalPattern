package org.example.abstractFactory;

public class Car {

    Long price;
    String engineCapacity;
    Long topSpeed;
    Experiance experiance;

    public Car(Long price, String engineCapacity, Long topSpeed) {
        this.price = price;
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    public String getExperiance() {
        return experiance.feeling();
    }

    protected void setExperiance(Experiance experiance) {
        this.experiance = experiance;
    }
}
