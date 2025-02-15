package com.regex_junit.validate_license_platenumber;

import com.regex_junit.validateusername.Validate;

import java.util.Scanner;

public class PlateNumber {
    public static void main(String[] args){
        // Creating Scanner object input
        Scanner input = new Scanner(System.in);

        // Taking input variable number for user
        System.out.print("Enter you License Plate Number : ");
        String number = input.nextLine();
        // Calling Class PlateValidate of checkValidate method
        PlateValidate.checkValidate(number);
    }

}
