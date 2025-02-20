package com.javacollectionstreams.annotations.useoverride;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}