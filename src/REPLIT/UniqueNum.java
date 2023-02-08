package REPLIT;

import java.util.Scanner;

public class UniqueNum {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
       for(int each:nums){
           int count=0;
           for(int other:nums){
               if(each==other){
                   count++;
               }
           }
           if(count==1){
               System.out.println(each);
           }
       }
    }
}
