package day21_multiDimentionalArray;

import utilities.ArrayUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[]array={1,2,3,4,5};
        int element=6;

        int[] new_array= Arrays.copyOf(array,array.length+1);
new_array[new_array.length-1]=element;
        System.out.println(Arrays.toString(new_array));
        //{1,2,3,4,5}
        System.out.println("--------------------------------------");


        int[]numbers={100,90,80,70,60};
     // numbers=ArrayUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------");
        double[]nums={20.2,30.20,30,40.5};
       nums= ArrayUtility.addElement(nums,2.2);
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------------------------");

        String[]names={"Yasin","Javir","Rebecca","Kimal"};
        names=ArrayUtility.addElement(names,"Muhtar");
        names=ArrayUtility.addElement(names,"Malik");
        System.out.println(Arrays.toString(names));
        System.out.println("------------------------");
        boolean contain=array.length==element;
        int[]array1={1,2,3,4,5};
        int element1=1;
        for (int each : array1) {
            for (int i = 0; i < each; i++) {
                each=element1;
                contain=true;

            }
        }

        }




        // return contain;

    }

