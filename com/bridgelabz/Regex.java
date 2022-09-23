package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    /**
     * Setting password which has at least 8 character one uppercase letter and one numeric number and
     * at least one special character and no whitespace allowed
     */
    public static void checkPassword(String password) {

        Pattern pattern = Pattern.compile("(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,}");
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        System.out.println(result);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking Password as input by the user
         */
        System.out.println("Enter Password");
        String password1 = scanner.next();
        System.out.println("Enter Second Password");
        String password2 = scanner.next();
        scanner.close();
        checkPassword(password1);
    /*
     for at least one uppercase letter this equation uses (?=.*[A-Z]) , for at least one digit (?=.*[0-9])
     for no whitespace allowed in the string this one uses (?=.*[@#$%^&+=])
     */
        Pattern pattern = Pattern.compile("(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*[@#$%^&+=])" + ".{8,}");


        if (pattern.matcher(password2).matches()) {
            System.out.println("Password is set");

        } else {
            System.out.println("Please Enter valid input Password is not Set");
        }

    /*
    if we write .{8} in middle or starting then it will not work we have to first add conditions we want uppercase
     lowercase then number of characters. In this whitespace is allowed but in above two it is not allowed
     */
        Boolean result = Pattern.compile("(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=.*[0-9])" + ".{8,}").matcher("Pass word123#").matches();
        System.out.println(result);

    }
}
