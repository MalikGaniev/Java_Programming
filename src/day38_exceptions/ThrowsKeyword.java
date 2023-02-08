package day38_exceptions;

import java.io.FileInputStream;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
       /*
        System.out.println("Program1 started");


        //System.out.println(100/0);
  try {
      Thread.sleep(1000);
  }catch (InterruptedException e) {
      e.printStackTrace();
  }



        System.out.println("Program 1 ended");

        System.out.println("--------------------------------");
        System.out.println("Program2 ended");*/
        System.out.println("Program1 started");
        Thread.sleep(100);
        System.out.println("Program1 ended");
        System.out.println("-------------------------");
        System.out.println("Program1 started");
        Thread.sleep(5000);
        System.out.println("Program1 ended");
        System.out.println("--------------------------------");
       // FileInputStream file=new FileInputStream("");
        System.out.println("-------------------------0");
        System.out.println("Program 3 started");
        Thread.sleep(1000);
        System.out.println("Program 3 ended");

    }
}
