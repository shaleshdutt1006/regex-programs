package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking Password as input by the user
         */
        System.out.println("Enter Password");
        String password = scanner.next();
        scanner.close();
/*
Password has at least 8 character . shows anything that we can take anything uppercase lowercase letter
or number or special character but at least 8 inputs should be there
 */
        Pattern pattern = Pattern.compile(".{8,}");
        Matcher matcher = pattern.matcher(password);

        if (pattern.matcher(password).matches()) {
            System.out.println("Password is set");

        } else {
            System.out.println("Please Enter valid input Password is not Set");
        }

/*
Second Method to achieve output
 */
Boolean result = Pattern.compile("[a-z A-Z 0-9]{8,}").matcher("Password123").matches();
System.out.println(result);

    }
}
