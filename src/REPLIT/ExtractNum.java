package REPLIT;

import java.util.Scanner;

public class ExtractNum {
    public static String extractNum(String s) {
        String nums="";

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                nums+=s.charAt(i);
            }
        }


return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

}

