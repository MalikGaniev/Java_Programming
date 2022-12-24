package day020_forEach;

import java.util.Arrays;

public class MultiplyOdd {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        for (int i = 0; i < number.length; i++) {
            if(number[i]%2==0){
                continue;
            }

            number[i]=number[i]*2;
        }


        System.out.println(Arrays.toString(number));


    }
}
