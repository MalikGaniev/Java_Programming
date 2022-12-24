package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array2D={{10,20,30},{40,50,60,70},{90,100}};
        //                  0            1             2


        for(int i =0;i<array2D.length;i++){//i: index number of 1D array in array2D
 int[]each1D=array2D[i];
            System.out.println(Arrays.toString(each1D));

            for(int j=0;j<each1D.length;j++){//j:index number of elements each 10 arrau
                int eaachElement=each1D[j];
                System.out.println(eaachElement);
            }


        }

        System.out.println("-------------------------------------------------");

        for(int[] each1DArray :array2D){
            System.out.println(Arrays.toString(each1DArray));
            for(int eachElement:each1DArray){
                System.out.println(eachElement);

                System.out.println("--------------------------------");
                for (int i = array2D.length - 1; i >= 0; i--) {
                    for (int i1 = array2D[i].length - 1; i1 >= 0; i1--) {
                       System.out.println(array2D[i][i1]);
                    }
                }




            }

        }


    }
}
