package REPLIT;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String input){
        //WRITE YOUR CODE BELOW:
        String m="";
        for (int i = input.length()-1; i >=0; i--) {
            m+=input.charAt(i);
        }



return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

}
