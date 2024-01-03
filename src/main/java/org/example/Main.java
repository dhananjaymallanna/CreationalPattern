package org.example;

import org.example.abstractFactory.Car;
import org.example.abstractFactory.VeryCostlyCarFactory;
import org.example.factoryPattern.Shoe;
import org.example.factoryPattern.ShoeFactory;
import org.example.BuilderPattern.Computer;
import org.example.prototypePattern.ApparelStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Factory demo
        Shoe shoe = ShoeFactory.getShoe("nike");
        System.out.println(shoe.getInfo());

        //Abstract Factory
        Car car = new VeryCostlyCarFactory().manufactureCar();
        System.out.println(car.getExperiance());
        //Builder Pattern
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        System.out.println(comp.getInfo());

        // Prototype pattern

        ApparelStore appstore = new ApparelStore();
        appstore.setStoreName("Prototype Store");
        appstore.fetchData();
        System.out.println(appstore);
        ApparelStore duplicatedappstore = appstore.cloneStore();
        duplicatedappstore.setStoreName("Cloned Store");
        System.out.println(duplicatedappstore);


    }

}