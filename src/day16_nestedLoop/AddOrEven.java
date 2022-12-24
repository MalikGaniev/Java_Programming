package day16_nestedLoop;

import java.util.Scanner;

public class AddOrEven {
    public static void main(String[] args) {
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number:");
            int number=input.nextInt();
            if(number%2==0){
                System.out.println(number+" even number");
            }else{
                System.out.println(number+" odd number");
            }
            System.out.println("Would you like to enter another number?Yes/No");
            String answer= input.next().toLowerCase();
            while(!(answer.equals("yes")||(answer.equals("no")))){//while the user provides invalid answer
                System.err.println("Please re-enter valid answer");
                answer=input.next().toLowerCase();
            }
if(answer.equals("no")){
    break;
}


        }






}}
