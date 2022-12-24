package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionArray_Vs_TwoDimensionArray {

    public static void main(String[] args) {
        int[]arr1D=new int[10];
        System.out.println(Arrays.toString(arr1D));

int[]arr1={1,2,3,4,5};
int[]arr2={1,23,45,56};
   int[]arr3={1,23,45,56};
        int[]arr4={5,4,6,7,1,23,45,56};
        int[][]arr2D=new int[5][];
        arr2D[0]=arr1D;
        arr2D[1]=arr2;
        arr2D[2]=arr3;
        arr2D[3]=arr4;
        arr2D[4]=arr1;
        System.out.println(Arrays.deepToString(arr2D));

    }



}
