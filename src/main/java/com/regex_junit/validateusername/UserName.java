package com.regex_junit.validateusername;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args){
        // Taking Scanner object input
        Scanner input = new Scanner(System.in);

        // Taking input variable name for user
        System.out.print("Enter User name : ");
        String name = input.nextLine();

        // Calling class validate checkValidate method
        Validate.checkValidate(name);

    }
}
