package com.generics.dynamic_online_marketplace;

// Taking class Product Generic Types
public class Product <T> {
    private final String name;
    private double price;
    private final T category;

    // Constructor
    public Product(String name, double price, T category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    // Using Getter And Setter for name , price , category variable
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price){
          this.price = price;
    }

    // Define the toString method for display the result only by object
    @Override
    public String toString() {
        return  "Name : '" + getName() +
                "\nPrice : " + getPrice() +
                "\nCategory : " + getCategory();
    }
}
