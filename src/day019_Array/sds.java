package day019_Array;

import java.util.Scanner;

public class sds {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence=input.nextLine().toLowerCase();
        System.out.println("Enter your word");
       String word=input.next().toLowerCase();
        int result=0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.contains(word)){
                sentence=sentence.replaceFirst(word,"");
              result++;
            }

        }
        System.out.println(result);


    }
}
