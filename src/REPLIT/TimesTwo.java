package REPLIT;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){


        for (int i = 0; i < nums.size(); i++) {
            int each=nums.get(i);
            each*=2;
nums.set(i,each);
        }





return nums;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
