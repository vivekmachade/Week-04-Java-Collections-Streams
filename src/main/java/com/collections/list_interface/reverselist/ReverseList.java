package com.collections.list_interface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {
    //Creating the reverse arraylist method
    public static ArrayList<Integer> ReverseArraylist(ArrayList<Integer> arr){
        // taking two pointer for swaping
        int left = 0;
        int right = arr.size() - 1;
        // Swaping the index elements
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        // return arraylist
        return arr;
    }
    //Creating the reverse linkedlist method
    public static LinkedList<Integer> ReverserLinkedlist(LinkedList<Integer> arr){
        // taking two pointer for swaping
        int left = 0;
        int right = arr.size() - 1;
        // Swaping the index elements
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        // return linkedlist
        return arr;
    }

    public static void main(String[] args){
        // Intializing the arraylist and linkedlist
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // storing element into list 1 to 5 element
        for(int i = 1; i<=5; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("LinkedList before reverse : "+arrayList);
        System.out.println("ArrayList before reverse  : "+linkedList);

        // Storing method return into reverseArraylist and reverseLinkedList
       ArrayList<Integer> reverseArraylist =  ReverseArraylist(arrayList);
       LinkedList<Integer> reverseLinkedList =  ReverserLinkedlist(linkedList);

       // Display the result
        System.out.println("LinkedList After reverse : "+reverseLinkedList);
        System.out.println("ArrayList After reverse  : "+reverseArraylist);
    }
}
