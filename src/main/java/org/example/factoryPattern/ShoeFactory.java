package org.example.factoryPattern;

public class ShoeFactory {
    public static Shoe getShoe(String brand){
         Shoe shoe= new Shoe();
         shoe.setBrand(brand);
         return shoe;
    }
}
