package day09;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Full name");
        String Full_name= input.nextLine();//Aaro King Daniel+Enter

        System.out.println("Enter your school name");
        String school_name= input.nextLine();

        System.out.println("Enter your gender:");
        String gender=input.next();//Male+Enter
        System.out.println("Enter your age");
    int age=input.nextInt();
    input.nextLine(); //Clear out the scanner
        //we have to provide extra one nextLine method if use nextLine method after other methods of scanner
        System.out.println("Enter your steet name: ");
        String street = input.nextLine();








    }
}
