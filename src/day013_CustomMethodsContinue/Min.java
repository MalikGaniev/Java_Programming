package day013_CustomMethodsContinue;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {

        System.out.println("Minimum number is "+minNum(10,20));











    }
  public static int minNum(int num,int num2){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter two numbers:");
   num=input.nextInt();
      num2=input.nextInt();
      input.close();
if(num>num2){
return num2;
}else{
    return num;
}
  }
}
