package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {





while(true){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your first number:");
    double num=input.nextDouble();
    System.out.println("Enter your mathOperator:");
   String mathOperator=input.next();
    if(!(mathOperator.equals("-")||mathOperator.equals("+")||mathOperator.equals("*")||mathOperator.equals("/"))){
        System.out.println("Invalid math operator.Operator");
        mathOperator=input.next();
    }
    System.out.println("Enter your second number:");
    double num2=input.nextDouble();
    if(mathOperator.equals("+")){
        System.out.println(num+num2);
    } else if (mathOperator.equals("-")) {
        System.out.println(num-num2);
    } else if (mathOperator.equals("/")) {
        System.out.println(num/num2);
    }else{
        System.out.println(num*num2);
    }
    System.out.println("Would you like to continue");
   String answer=input.next().toLowerCase();
   while(!(answer.equals("yes"))&&!(answer.equals("no"))){
        System.err.println("Please re-enter valid answer");
        answer=input.next().toLowerCase();
    }if(answer.equals("no")){
       break;
    }

}











    }
}
