package day017_CustomClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {


        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//a
            int frequency = 0;

        for (int i = 0; i < str.length(); i++) {//check how many time the ch has appeared in str
            if(str.charAt(i)==ch){//if the ch appeared in the string
                frequency++;//increase the frequency by 1;
            }
        }
    if(frequency==3){//if the frequency is one,then its unique
        unique+=ch;}

    }
        System.out.println(unique);
}}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd

 */