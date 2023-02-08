package REPLIT;

import java.util.Scanner;

public class Sign {
    public static void sign(int n){
        //WRITE YOUR CODE BELOW
if(n>0){
    System.out.println("Positive");
}else if(n==0){
    System.out.println("zero");
}else{
    System.out.println("Negative");
}


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);

    }
}

