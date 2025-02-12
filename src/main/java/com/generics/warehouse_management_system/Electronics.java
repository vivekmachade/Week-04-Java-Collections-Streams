package com.generics.warehouse_management_system;

// Taking Electronic class which extends WarehouseItem class
public class Electronics extends WarehouseItem{

    // Taking Brand variable for Electronic class
    private final String itemBrand ;

    //constructor for intializing the class varialbe and setter the value variable
    public Electronics(String itemName, int itemPrice, int itemQuantity , String itemBrand) {
        // Taking super class to call or involck the superclass constructor
        super(itemName, itemPrice, itemQuantity);
        this.itemBrand = itemBrand;
    }

    // getter method for getItemBrand varialbe to access itemBrand
    public String getItemBrand() {
        return itemBrand;
    }

    // Taking toString method for return Display result by using object only
    @Override
    public String toString() {
        return super.toString()+"\n Item Brands : "+ getItemBrand();
    }
}
