package org.example.factoryPattern;

public class Shoe {
    private String brand;

    public Shoe() {
        createWhiteLabelShoe();
    }
    private void createWhiteLabelShoe(){
        System.out.println("made the shoes");
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        System.out.println("attached the label");
        this.brand = brand;
    }

    public String getInfo(){
        return "\nThis is "+brand+" shoe\n";
    }
}
