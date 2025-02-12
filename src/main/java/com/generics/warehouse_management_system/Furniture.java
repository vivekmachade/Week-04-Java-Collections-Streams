package com.generics.warehouse_management_system;

// Taking furniture class which extends WarehouseItem class
public class Furniture extends WarehouseItem {

    // Taking Material variable for Furiniture class
    private final String itemMaterial ;

    //constructor for intializing the class varialbe and setter the value variable
    public Furniture(String itemName, int itemPrice, int itemQuantity, String itemMaterial) {

        // Taking super class to call or involck the superclass constructor
        super(itemName, itemPrice, itemQuantity);
        this.itemMaterial = itemMaterial;
    }

    // getter method for itemMaterial varialbe to access itemMaterial
    public String getItemMaterial() {
        return itemMaterial;
    }

    // Taking toString method for return Display result by using object only
    @Override
    public String toString() {
        return super.toString() +"\n Material use in Item" + getItemMaterial();
    }
}
