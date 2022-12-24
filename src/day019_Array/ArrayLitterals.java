package day019_Array;

import java.util.Arrays;

public class ArrayLitterals {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        int[] nums={1,2,3,4,5};//Array Literal


        System.out.println(numbers.length);
        System.out.println(nums.length);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("---------------------");
        //element:       1         2           3           4         5        6          7
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index:         0         1          2           3          4        5         6

       int n=2;
        System.out.println(days[n-1]);
        System.out.println("---------------------------------------");


        String[]month={"January","February","March","April","May","June","July","September","October","November","December"};
        int n2=7;
        System.out.println(month[n2-1]);
        for (int i = month.length-1; i >=0; i++) {
            System.out.println(month[i]);
        }


    }
}
