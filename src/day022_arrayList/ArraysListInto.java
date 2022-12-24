package day022_arrayList;

import java.util.Arrays;
import java.util.ArrayList;
public class ArraysListInto {
    public static void main(String[] args) {


        int []array=new int[5];
        array[0]=10;//{10.0,0,0,0}
        array[1]=10;//{10,20,0,0,0}
        array[2]=10;
        array[3]=10;
        array[4]=10;
       // array[5]=10;
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------------");
ArrayList<Integer> list=new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());

    }
}
