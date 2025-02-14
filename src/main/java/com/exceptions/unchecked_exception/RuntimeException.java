package com.exceptions.unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args){
        // Creating Scanner object
        Scanner input = new Scanner(System.in);
        try{
            // Taking variable numerator and denominator by user
            System.out.print("Enter numerator : ");
            int numerator = input.nextInt();

            System.out.print("Enter denominator : ");
            int denominator = input.nextInt();

            // Storing the division between numerator and denominator in answer
            int answer = numerator/denominator;
            // Display the result
            System.out.println("Division of your value is : "+ answer);

        }
        // Catch if Value is non-numeric value
        catch (InputMismatchException e) {
          System.out.println("Warning! Enters a Numeric value.\n");
        }
        // Catch if denominator is zero is division is infinity
        catch(ArithmeticException e){
            System.out.println(" Warning! Division by zero ");
        }
    }
}
