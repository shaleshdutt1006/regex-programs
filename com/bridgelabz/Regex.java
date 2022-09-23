package com.bridgelabz;

import java.util.regex.*;

public class Regex {


    public static void main(String[] args) {


        Regex regex = new Regex();
        /*
        Name has first letter capital and at least three character is in first name
         */
        Pattern p = Pattern.compile("^[A-Z ]" + "[a-z]{2,}");

        Matcher b = p.matcher("Dew");
        boolean result = b.matches();
        System.out.println(result);
        /*
        Second way to validate the name condition
         */
        Boolean result2 = p.compile("^[A-Z ]" + "[a-z]{2,}").matcher("Shalesh").matches();
        System.out.println(result2);
        /*
        Third way to achieve the matching condition
         */
        boolean result3 = Pattern.matches("^[A-Z ]" + "[a-z]{2,}", "aman");
        System.out.println(result3);


    }
}
