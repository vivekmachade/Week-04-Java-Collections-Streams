package com.regex_junit.extract_all_email_addresses_text;

import java.util.ArrayList;
import java.util.Arrays;

public class Gmail{
    public static  void main(String[] args){
        // Taking String example for extracting the gmail
        String example = "Contact us at support@example.com and info@company.org";
         //calling Class extractGmail of extract method
       ExtractGmail.extract(example);

    }
}