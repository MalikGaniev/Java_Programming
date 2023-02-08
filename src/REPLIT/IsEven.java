package REPLIT;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num){
        //WRITE YOUR METHOD
boolean isEven=false;
if(num%2==0){
    isEven=true;
}
return isEven;
    }




}
