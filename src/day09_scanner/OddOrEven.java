package day09;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=input.nextInt();
        String result = "Invalid number ";

        if(num%2==0);
            result="Even Number";

        if(num%2==1)
        result="Odd Number";
        System.out.println(result);
   input.close();

    }
}
