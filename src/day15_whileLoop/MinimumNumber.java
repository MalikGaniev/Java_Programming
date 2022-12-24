package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min =2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number");
           int num= input.nextInt();
           if(min>num){//if the user entered entry is less than the current minimum number
               min=num;//then user entered number should be the minimum number
           }

        }

        System.out.println(min);
input.close();






    }
}
