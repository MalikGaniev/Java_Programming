package day09;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {



    Scanner input= new Scanner(System.in);//for reading user inputs
       System.out.println("Enter your first number: ");
       byte num1= input.nextByte();
        System.out.println("Enter your second number: ");
     short num2=input.nextShort();
        System.out.println("Enter your third number:");
        int num3=input.nextInt();
        System.out.println("Enter your forth number");
       int num4=(int)input.nextLong();
        /*
       input.close();//Scanner is close cannot use it to get inputs agains
    System.out.println("Number five:");
       */
        int num5=input.nextInt();
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);
        System.out.println("Forth number "+num4);



        }
}

