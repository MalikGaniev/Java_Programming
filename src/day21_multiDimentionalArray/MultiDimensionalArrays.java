package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][]arr2D1={{1,2},{3,4,5}};
int[][]arr2D2={{6,7,8,9},{10,11},{12,13,14}};
int[][]arr2D3={{15,16,17,18}};
//                  0      1         0         1         2           0
int[][][] arr3D={{{1,2},{3,4,5}},{{6,7,8,9},{10,11},{12,13,14}},{{15,16,17,18}}};
//index:                  0                                  1                           2

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));//{{6,7,8,9},{10,11},{12,13,14}}
        System.out.println(Arrays.toString(arr3D[0][1]));//[3,4,5]
        System.out.println(Arrays.toString(arr3D[1][0]));//[6,7,8,9]
        System.out.println(arr3D[0][0][0]);//[1]

        System.out.println("--------------------------------------");

        for (int i = 0; i < arr3D.length; i++) {//i:index of number each 2 dimensional array
            int[][]each2DArray=arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));
            for (int i1 = 0; i1 < each2DArray.length; i1++) {
                int[]each1Array=each2DArray[i1];
                System.out.println(Arrays.toString(each1Array));
                for (int i2 = 0; i2 < each1Array.length; i2++) {
                    int eachElement=each1Array[i2];
                    System.out.println(eachElement);
                }

            }

        }








    }}



