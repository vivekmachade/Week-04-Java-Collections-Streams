package com.regex_junit.extract_all_email_addresses_text;

import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class ExtractGmail {
    public static void extract(String example){
        // Defining the regex for Gmail checking
        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}\\b");
        Matcher matcher = pattern.matcher(example);
        while (matcher.find()) {
            System.out.println("Gmail : " + matcher.group());
        }
    }
}
