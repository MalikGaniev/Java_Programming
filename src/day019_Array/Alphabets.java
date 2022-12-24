package day019_Array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        char[]ascending=new char[26];//index 0~25
        char[]descending=new char[26];//index 0~25




        for (int i = 0,j='A',m='Z'; i < ascending.length; i++,j++,m--) {
ascending[i]=(char)j;
descending[i]=(char)m;
        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("-----------------------------------------");



        char[]characters=new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i]=(char)i;
        }

        System.out.println(Arrays.toString(characters));




    }


}
