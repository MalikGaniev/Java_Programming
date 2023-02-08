package REPLIT;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            int count=0;//reset every iteration of the loop
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=count+str.charAt(i);
        }





return result;

}}
