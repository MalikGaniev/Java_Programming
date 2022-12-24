package day020_forEach;

import java.util.Arrays;
import utilities.ArrayUtility;
public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        int[] arr2={5,6};
       int [] arr3=new int[arr1.length+arr2.length];//Because we need to make sure that 3th array have enough capacity to contain arr1 and arr2
       int k=0;//for arr3 index numbers
        for (int i = 0,j=0; i < arr1.length; i++,k++) {// i: for first arrays index number
            arr3[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {//for second arrays index numbers
            arr3[k]=arr2[i];
        }
 int[]a1={20,30,40,50,};
        int[]a2={70,20,90};
int[] a3=ArrayUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------");
        double[]b1={10.5,5.5,3.5,6.5,8,5};
        double[]b2={20.5,15.5,13.5};
        double[]b3=ArrayUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));
        System.out.println("--------------------------------");


        char[]ch1={'A','B','C','D','E'};
        char[] ch2={'X','Y','Z'};
        char[]ch3=ArrayUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));
        System.out.println("--------------------------------");
      String []s1={"Max","Masha"};
      String []s2={"Tax","Rex","Mex"};
      String []s3=ArrayUtility.merge(s1,s2);
        System.out.println(Arrays.toString(s3));
    }
}
