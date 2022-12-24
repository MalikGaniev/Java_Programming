package day11_string;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        String emailAddress = "mike_tyson@gmail.com";
        int email1Id = emailAddress.indexOf('_')+1;
        int email2Id = emailAddress.indexOf('@');

        String part1 = emailAddress.substring(0,email1Id-1);
        String part2 = emailAddress.substring(email1Id,email2Id);
        boolean underScore = emailAddress.contains("_");

        if (underScore){
            int beginning= emailAddress.indexOf('@');
            String newEmail = emailAddress.substring(beginning);

            System.out.println((part2+"_"+part1)+newEmail);
        }else {
            System.out.println(emailAddress);





        }}}









/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */