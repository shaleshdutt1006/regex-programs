package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    /**
     * Setting passowrd which has at least 8 character one uppercase letter and one numeric number
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking Password as input by the user
         */
        System.out.println("Enter Password");
        String password = scanner.next();
        scanner.close();
    /*
    Password has at least 8 character  one numeric number and one uppercase letter
    . shows anything it can take as input or ? shows that it Matches up
    exactly upon one character and * means matches zero or more time the preceding character
     */
        Pattern pattern = Pattern.compile("(?=.*[A-Z])" + "(?=.*[0-9])" + ".{8,}");
        Matcher matcher = pattern.matcher(password);

        if (pattern.matcher(password).matches()) {
            System.out.println("Password is set");

        } else {
            System.out.println("Please Enter valid input Password is not Set");
        }

    /*
    if we write .{8} in middle or starting then it will not work we have to first add conditions
     we want uppercase lowercase then number of characters we want
     */
        Boolean result = Pattern.compile("(?=.*[A-Z])" + "(?=.*[0-9])" + ".{8,}").matcher("Password123").matches();
        System.out.println(result);

    }
}
