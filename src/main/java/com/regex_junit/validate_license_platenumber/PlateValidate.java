package com.regex_junit.validate_license_platenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlateValidate {
    public static void checkValidate(String number){
        // Setting Regex pattern A-Z,0-9
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
        // Checking number character is match to given regex
        Matcher matcher = pattern.matcher(number);
        //storing the answer in false or true
        boolean result = matcher.matches();

        // print the result base into boolean
        if(result) System.out.println("This License Plate Number is validate");
        else System.out.println("This License Plate Number is validate");
    }
}
