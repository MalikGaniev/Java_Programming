package day09;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//Enter
        System.out.println("Enter your age:");
        int age=input.nextInt();//45+Enter

        input.nextLine();//Take out Enter
        System.out.println("Enter your full name");
      String FullName= input.nextLine();
        System.out.println("age = " + age);
        System.out.println("FullName = " + FullName);











    }
}
