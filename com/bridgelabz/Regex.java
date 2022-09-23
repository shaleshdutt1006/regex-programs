package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking first name and last name as input by the user
         */
        System.out.println("Enter First Name");
        String firstname = scanner.next();
        System.out.println("Enter Last Name");
        String lastname = scanner.next();
        scanner.close();
        /*
       Last Name has first letter capital and at least three character is in last name
         */

            /*
            taking input from the user if both condition first and last name satisfies
            then it shows true otherwise false
             */
        boolean result1 = firstname.matches("^[A-Z a-z]{2,}");
        boolean result2 = lastname.matches("[A-Z]" + "[a-z]{2,}");

        if (result1 == true && result2 == true) {
            System.out.println("Validate condition");
        } else {
            System.out.println("Not validate");
        }

        /*
        Second way to validate the name
        condition \s denotes space between first name and last name
        $ sign used to matches end of string
         */
        Pattern p = Pattern.compile("^[A-Z a-z]{2,}" + "\s" + "$[A-Z]" + "[a-z]{2,}");
        Boolean result3 = p.compile("^[A-Z a-z]{2,}" + "\s" + "[A-Z]" + "[a-z]{2,}").matcher("Shalesh Dutt").matches();
        System.out.println(result3);
        /*
        Third way to achieve the matching condition
         */
        boolean result4 = Pattern.matches("^[A-Z a-z]{2,}" + "\s" + "[A-Z]" + "[a-z]{2,}", "aman sharma");
        System.out.println(result4);


    }
}
