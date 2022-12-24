package day12_customMethods;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter your first name");
  String first=intput.next().trim().replace(" ","");
       // replace(" ",""); replace() methods will make sure that  the white spaces & addionate spaces between the characters will be removed
        System.out.println("Enter your last name");
String last=intput.next().trim().replace(" ","");

first= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        //getting first character of first name +the remaining characters of the first name

last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();




        String full_Name=first+" "+last;
        System.out.println(full_Name);









    }
}
/*
2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")
        output:
            full name: Cydeo School
 */