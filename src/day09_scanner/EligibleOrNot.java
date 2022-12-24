package day09;

import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        String result="invalid number";
        int num = input.nextInt();
        if(num<21){
            result="Not Eligible to  buy alcohol";
        }else{
            result="Eligible to buy alcohol";
        }
        System.out.println(result);

input.close();


    }
}
