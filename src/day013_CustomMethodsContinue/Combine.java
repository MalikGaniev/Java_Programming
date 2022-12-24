package day013_CustomMethodsContinue;

import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your words:");
        String word1=input.next();
        String word2=input.next();
        System.out.println(combine(word1,word2));
        input.close();


        System.out.println(combine("max","max"));





    }



    public static String combine(String word1,String word2){
        String result;
if(word1.toLowerCase().substring(word1.length()-1).equals(word2.toLowerCase().substring(0,1))){
    result=word1+word2.substring(1);
}else{
    result=word1+" "+word2;
}return result;









    }




}
/*
Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */