package com.generics.dynamic_online_marketplace;

// Taking Cloathing class
public class Clothing {
    private final String type;
    private final String size;

    // constructor
    public Clothing(String type, String size) {
        this.type = type;
        this.size = size;
    }
    // Using Getter and Setter for set variable Value
    public String getType(){
        return type;
    }
    public String getSize(){
        return size;
    }


    // Define the toString method for display the result only by object
    @Override
    public String toString() {
        return "Type : " + getType() + ", size : " + getSize();
    }
}
