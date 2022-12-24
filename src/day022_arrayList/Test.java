package day022_arrayList;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
int[] numbers={10,20,30,40,50,60};

       boolean has25= ArrayUtility.isContain(numbers,25);

        System.out.println(has25);

        System.out.println("----------------------------------");
String []student={"Symaya","Hamza","Marika"};
        System.out.println(ArrayUtility.isContain(student,"Khasan"));
int []num={1,2,3,4,5,6};
        //System.out.println(Arrays.toString(ArrayUtility.remove(num,0)));


    }

}
