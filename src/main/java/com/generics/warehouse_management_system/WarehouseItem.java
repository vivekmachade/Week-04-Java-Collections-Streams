package com.generics.warehouse_management_system;
// taking WarehouseItem as abstrace class for the storage management
public abstract class WarehouseItem {
    private final String itemName;
    private final int itemPrice ;
    private final int itemQuantity;

    // constructor and setter value of this abstrace class variable
    public WarehouseItem(String itemName ,int itemPrice, int itemQuantity) {
        this.itemName = itemName ;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;

    }
    // getter value for abstrace class variable
   public String getName(){
        return itemName;
   }
   public int getPrice(){
        return itemPrice;
   }
   public int getQuantity(){
        return itemQuantity;
   }
    // Taking toString method for return Display result by using object only
    @Override
    public String toString() {
        return " Name of the product : "+getName()+"\n Price of the Product : $"+getPrice()+"\n Quantity of item : "+getQuantity();
    }
}
