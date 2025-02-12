package com.generics.warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public List<T> getItem() {
        return items;
    }

    public void setItem(T item) {
        items.add(item);
    }
    public void displayList(List<? extends WarehouseItem> itemSet){
        for(WarehouseItem item : itemSet){
            System.out.println(item);
            System.out.println();
        }
    }

}
