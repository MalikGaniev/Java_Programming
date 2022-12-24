package day020_forEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Cydeo school";

      // char[] ch= str.toCharArray();
char[] ch=str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("---------------------------------------");
String str2="Today is a great day to learn java";
String[] words=str2.split( " ");
        System.out.println(Arrays.toString(words));


        System.out.println("----------------------------------------------------------");

        String sentence="I love Java";


       String[] arr= ArrayUtility.reverse(sentence.split(" "));//[Java, love I]
        System.out.println(Arrays.toString(arr));
        //"Java love I"

      String reversedSentence="";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence+=arr[i]+" ";
        }















    }
}
