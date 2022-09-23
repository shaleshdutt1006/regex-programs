package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {

    public static String validateEmail(String email) {

        String emailRegex = ("[abc]{1,3}" + "[.]" + "[a-z 0-9]{1,}" + "[@]" + "bl{1}" + "[.]" + "co{1}" + "[.]" + "[a-z]{1,}");
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return "Valid Email";
        } else {
            return "Invalid Email";
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        taking email as input by the user
         */
        System.out.println("Enter Email to Check valid or invalid");
        String email = scanner.next();
        scanner.close();
        System.out.println(validateEmail(email));
  /*
  Second way to get output
  bl{1} means bl should be compulsory one time
   */
        Boolean result = Pattern.compile("^[abc]{3,}" + "[.]" + "[a-z 0-9]{1,}" + "[@]" + "bl{1}" + "[.]" + "co{1}" + "[.]" + "[a-z]{1,}").matcher("abc.xyz@al.co.in").matches();
        System.out.println(result);
        Boolean result1 = Pattern.compile("^[abc]{3,}" + "[.]" + "[a-z 0-9]{1,}" + "[@]" + "bl{1}" + "[.]" + "co{1}" + "[.]" + "[a-z]{1,}").matcher("abc.pq9@bl.co.in").matches();
        System.out.println(result1);


    }
}
