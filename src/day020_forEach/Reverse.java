package day020_forEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int[]reverse=new int[array.length];


        for (int i = array.length-1,j=0;i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        System.out.println(Arrays.toString(reverse));
int[] nums={10,20,30,40,50};
        nums=ArrayUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------------");
        double[]a1={1.1,2.2,3.3,4.4,5.5,6.6};
        a1=ArrayUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));


    }
}

