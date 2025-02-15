package com.regex_junit.validateusername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public static void checkValidate(String name){

        // Regex check in a-z , A-Z , _ , 0-9
        Pattern pattern = Pattern.compile("^[a-zA-Z]+_[0-9]{3,15}$");
        // Matcher is check the name is match with give regex
        Matcher matcher = pattern.matcher(name);
        // checking the name present in regex in true or false
        boolean result = matcher.matches();

        // if result is false print
        if(result == false)
        {
            System.out.println("Your UserName Invalidate");
        }
        // or print
        else{
            System.out.println("Your UserName validate");
        }

    }

}
