package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        /*
         Taking an Arraylist to check Various email whether it is correct or not and adding emails in the list
         */

        arrayList.add("abc111@abc.com");
        arrayList.add("abc-100@abc.com");
        arrayList.add("abc.100@yahoo.com");
        arrayList.add("abc+100@gmail.com");
        arrayList.add("abc@1.com");
        arrayList.add("abc-100@yahoo.com");
        arrayList.add("abc_pqr@gmail.com");
        arrayList.add("abc.100@abc.com.au");
        arrayList.add("abc()*@gmail.com");
        arrayList.add("abc@%*.com");
        arrayList.add("abc@abc@gmail.com");
        arrayList.add("abc@gmail.com.1a");
        arrayList.add(".abc@abc.com");
/*
applying the pattern to check whether the email matches the pattern or not
 */

        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*" + "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}([.]{2,4})?$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (int i = 0; i < arrayList.size(); i++) {
         /*
         using for-loop checking every email whether it matches the defined pattern or not
          */

            if (pattern.matcher(arrayList.get(i)).matches()) {

                System.out.println("valid");

            } else {
                System.out.println("invalid");
            }

        }


    }
}

