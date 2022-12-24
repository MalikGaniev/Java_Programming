package day013_CustomMethodsContinue;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your title");
        String word=input.next();
        System.out.println(title(word));
input.close();
    }

    public static String title(String word) {


        String result = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
return result;
    }


}
/*
Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java


 */
