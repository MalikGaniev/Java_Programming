package day11_string;

import day04_concatenation.FullName;

import java.util.Scanner;

public class FirstAndLastName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstName =input.next();
        System.out.println("Enter your Second name:");
        String secondName = input.next();

        String correctForm1 = firstName.toLowerCase().substring('1');
        String correctForm2 = secondName.toLowerCase().substring('1');
        char firstUpper = firstName.toUpperCase().charAt(0);
        char secondUpper = secondName.toUpperCase().charAt(0);

        System.out.println( firstUpper + correctForm1 + " " +secondUpper + correctForm2 );





    }
}
