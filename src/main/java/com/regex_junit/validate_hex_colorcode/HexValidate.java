package com.regex_junit.validate_hex_colorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexValidate {
    public static void checkValidate(String code) {

        // Define Regex #[a-f][A-F][0-9]
        Pattern pattern = Pattern.compile("#[[a-f][A-F][0-9]]{6}");
        // Checking code is following give regex
        Matcher mat = pattern.matcher(code);
        // Storing into result in boolean
        boolean result = mat.matches();

        if(result)
        {
            System.out.println("Your HexCode validate");
        }
        // or print
        else{
            System.out.println("Your HexCode Invalidate");
        }
    }
}
