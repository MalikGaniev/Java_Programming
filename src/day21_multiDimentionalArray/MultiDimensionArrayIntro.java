package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionArrayIntro {
    public static void main(String[] args) {

        int[] arr={10,20,30};
        int [] arr2={40,50,60,70};
        int[]arr3={90,100};
        int[]arr4={1000,2000};
        System.out.println("-------------------------------");


        int[][] array2D={{10,20,30},{40,50,60,70},{90,100},arr4};//index
//     index:               0             1           2      3
        System.out.println(array2D.length);
        System.out.println(Arrays.toString(array2D[1]));//{40,50,60,70}
        System.out.println(array2D[2][0]);//90
        System.out.println(array2D[1][2]);//60
    }
}
