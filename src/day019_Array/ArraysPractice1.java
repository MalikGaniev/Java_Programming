package day019_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {


        String[] myGroup=new String[5];
        myGroup[0]="Olya";
        myGroup[1]="Nastya";
        myGroup[2]="Nadezda";
        myGroup[3]="Ardi";
        myGroup[myGroup.length-1]="Aidana";
        myGroup[1]="Rahim";
        System.out.println(Arrays.toString(myGroup));
        System.out.println(myGroup[2]);
        for (int i = myGroup.length-1;i>=0; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("------------------------------");
        for (int i = myGroup.length - 1; i >= 0; i--) {

        }




    }
}
