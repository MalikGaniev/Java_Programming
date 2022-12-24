package utilities;

import java.util.Arrays;

public class ArrayUtility {
  public static int[] merge(int []arr1,int[]arr2){

      int [] arr3=new int[arr1.length+arr2.length];//Because we need to make sure that 3th array have enough capacity to contain arr1 and arr2
      int k=0;//for arr3 index numbers
      for (int i = 0,j=0; i < arr1.length; i++,k++,j=0) {// i: for first arrays index number
          arr3[k]=arr1[i];
      }
      for (int i = 0; i < arr2.length; i++,k++) {//for second arrays index numbers
          arr3[k] = arr2[i];
      }
      return arr3;

}

public static double[]merge(double[]arr1,double[] arr2){
   double[] arr3=new double [arr1.length+arr2.length];//Because we need to make sure that 3th array have enough capacity to contain arr1 and arr2
   int k=0;//for arr3 index numbers
    for (int i = 0,j=0; i < arr1.length; i++,k++,j=0) {// i: for first arrays index number
        arr3[k]=arr1[i];}
    for (int i = 0; i < arr2.length; i++,k++) {//for second arrays index numbers
        arr3[k] = arr2[i];
    }
    return arr3;
}
    public static char[]merge(char[]arr1,char[] arr2){
        char [] arr3=new char[arr1.length+arr2.length];//Because we need to make sure that 3th array have enough capacity to contain arr1 and arr2
        int k=0;//for arr3 index numbers
        for (int i = 0,j=0; i < arr1.length; i++,k++,j=0) {// i: for first arrays index number
            arr3[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {//for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

}
    public static String[]merge(String[]arr1,String[] arr2){
        String[] arr3=new String[arr1.length+arr2.length];//Because we need to make sure that 3th array have enough capacity to contain arr1 and arr2
        int k=0;//for arr3 index numbers
        for (int i = 0,j=0; i < arr1.length; i++,k++,j=0) {// i: for first arrays index number
            arr3[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {//for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;


}
    public static int[]reverse(int[]array){
        int[]reverse=new int[array.length];


        for (int i = array.length-1,j=0;i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        return reverse;
    }

    public static double[]reverse(double[]array){
        double[]reverse=new double[array.length];


        for (int i = array.length-1,j=0;i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        return reverse;





    }

    public static char[]reverse(char[]array){
        char[]reverse=new char[array.length];


        for (int i = array.length-1,j=0;i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        return reverse;





}

    public static String[]reverse(String[]array){
        String[]reverse=new String[array.length];


        for (int i = array.length-1,j=0;i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        return reverse;





}

     public static int[]addElement(int[]array,int element){
         int[] new_array= Arrays.copyOf(array,array.length+1);
         new_array[new_array.length-1]=element;
         return new_array;
 }

    public static double[]addElement(double[]array,double element){
        double[] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;
        return new_array;
    }
    public static String[]addElement(String[]array,String element){
        String[] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;
        return new_array;
    }

public static boolean isContain(int[]array,int element) {

    for (int each : array) {
        if (each == element) {
            return true;
        }

    }
    return false;
}

    public static boolean isContain(double[]array,double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }


    public static boolean isContain(char[]array,char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }

    public static boolean isContain(String[]array,String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }

        }
        return false;
    }
 /* public static int[]remove(int[]array, int index){
      for (int remove : array) {
         if(array[index]==index){
             array[index]=index-1;
        }
      }
      return array;*/









  }

