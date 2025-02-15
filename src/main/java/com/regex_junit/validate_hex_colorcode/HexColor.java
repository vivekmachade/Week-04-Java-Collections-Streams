package com.regex_junit.validate_hex_colorcode;

import java.util.Scanner;

public class HexColor {
    public static void main(String[] args){
        // Creating Scanner object input
        Scanner input = new Scanner(System.in);

        // Taking hax variable for user
        System.out.print("Enter you Hax Color code :");
        String code = input.nextLine();

        HexValidate.checkValidate(code);
    }
}
