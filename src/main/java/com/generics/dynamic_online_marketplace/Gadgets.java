package com.generics.dynamic_online_marketplace;

// Taking Gadegets class
public class Gadgets{
    private final String brand;
    private final String type;

    // Constructor of Brand and type
    public Gadgets(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // Define the toString method for display the result only by object
    @Override
    public String toString() {
        return "Brand : " + brand + ",\nType : " + type;
    }
}
