package day37_exceptions;

import java.util.Locale;

public class TryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program started");
try {


        System.out.println(9/0);//Artihmetic Expection
    System.out.println("Try Block");}catch (ArithmeticException e){
    System.out.println("Catch Block");
}

        System.out.println("Program ended");
String str=null;
        System.out.println("----------------------------------");
        System.out.println("Program 2 Started");
        try {
            System.out.println(str.toLowerCase(Locale.ROOT));
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program2 ended");
        System.out.println("-----------------------------");
        System.out.println("Program 3 started");
        try {


Thread.sleep(3000);
            System.out.println("Try Block");}catch (InterruptedException e){

        }
        System.out.println("Program3 ended");
        System.out.println("------------------------");
        int[]arr={1,2,3,4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Program ended");
        System.out.println("----------------------");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Program ended");

    }

}
