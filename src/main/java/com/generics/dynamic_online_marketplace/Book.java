package com.generics.dynamic_online_marketplace;

// Taking Book class
public class Book {
    private String genre;


    // constructor
    public Book(String genre) {
        this.genre = genre;
    }

    // Define the toString method for display the result only by object
    @Override
    public String toString() {
        return "Genre : " + genre;
    }
}
