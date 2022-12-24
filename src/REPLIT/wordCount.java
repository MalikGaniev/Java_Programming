package REPLIT;

import java.util.Scanner;

public class wordCount {
    public static int wordCount(String words) {
        // your code
        int wordCount1=1;
        for (int i = 0; i < words.length(); i++) {
            if(words.charAt(i)==' '||words.charAt(i)=='.'){
                wordCount1++;
            }
        }

return wordCount1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}



