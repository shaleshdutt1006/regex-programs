package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {

    public static String validateMobileNumber(String Number) {
        /*
        (91): country code of number should be 91 ? is used to matches up exactly one character
        [7-9] means : starting of the number may contain a digit between 7 to 9
        [0-9]{9} means : it contains any digits from 0 to 9 and there should be 9 digits
         */

        String MobileNumber = ("(91)?" + "[1-9]" + "[0-9]{9}");
        Pattern pattern = Pattern.compile(MobileNumber);
        if (pattern.matcher(Number).matches()) {
            return "Valid Mobile Number";
        } else {
            return "Invalid Mobile Number";
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking Mobile number as input by the user
         */
        System.out.println("Enter Mobile Number");
        String number = scanner.next();
        scanner.close();
        System.out.println(validateMobileNumber(number));
  /*
  Second way to get output

   */
        Boolean result = Pattern.compile("^91{1}" + "\s" + "[0-9]{1,10}").matcher("91 5624815891").matches();
        System.out.println(result);
/*
third way to get output
 */
        Pattern pattern = Pattern.compile("^91{1}" + "\s" + "[0-9]{1,10}");
        Matcher matcher = pattern.matcher("91 9856415425415");
        boolean result2 = matcher.matches();
        System.out.println(result2);

    }
}
