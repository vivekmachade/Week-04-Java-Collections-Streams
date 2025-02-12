package com.generics.warehouse_management_system;

import java.util.List;

public class Main {
    public static void main(String[] args){
        // creating storage for electronic Items
        Storage<Electronics> electronicsStorage = new Storage<>();

        // storing electronic items
        electronicsStorage.setItem(new Electronics("Mobile", 15000, 2,"Oppo"));
        electronicsStorage.setItem( new Electronics("Laptop", 65000, 4,"Dell"));

        // creating storage for grocery Items
        Storage<Groceries> groceryStorage = new Storage<>();
        // storing grocery items
        groceryStorage.setItem(new Groceries("Rice", 30, 4,"25-02-2025"));
        groceryStorage.setItem(new Groceries("Flour", 33, 5,"28-02-2025"));

        // creating storage for furniture Items
        Storage<Furniture> furnitureStorage = new Storage<>();
        // storing furniture items
        furnitureStorage.setItem(new Furniture("Chair", 500,5, "Wood"));
        furnitureStorage.setItem(new Furniture("Table", 500,6, "Metal"));

        System.out.println();
        System.out.printf("------------------------------------------------%n");
        // displaying electronic items
        System.out.println(" Displaying Electronic Items ");
        System.out.println();
        electronicsStorage.displayList(electronicsStorage.getItem());
        System.out.println();
        System.out.printf("------------------------------------------------%n");

        // displaying Grocery items
        System.out.println(" Displaying Grocery Items ");
        System.out.println();
        electronicsStorage.displayList(groceryStorage.getItem());
        System.out.println();
        System.out.printf("------------------------------------------------%n");

        // displaying Furniture items
        System.out.println(" Displaying Furniture Items ");
        System.out.println();
        electronicsStorage.displayList(furnitureStorage.getItem());
        System.out.println();
        System.out.printf("------------------------------------------------%n");
    }
}
