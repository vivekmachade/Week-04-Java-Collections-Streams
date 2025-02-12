package com.generics.warehouse_management_system;

// Taking Groceries class which extends WarehouseItem class
public class Groceries extends WarehouseItem{

    // Taking ExpiryDate variable for Groceries class
    private final String expiryDate;

    //constructor for intializing the class varialbe and setter the value variable
    public Groceries(String itemName, int itemPrice, int itemQuantity , String expiryDate) {
        // Taking super class to call or involck the superclass constructor
        super(itemName, itemPrice, itemQuantity);
        this.expiryDate = expiryDate;
    }

    // getter method for getExpireDate varialbe to access expiryDate
    public String getExpireDate() {
        return expiryDate;
    }

    // Taking toString method for return Display result by using object only
    @Override
    public String toString() {
        return super.toString() + "\n Item Expiry Date : "+getExpireDate();
    }
}
