package day019_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do u want to enter?");
        int total=input.nextInt();
        int[]numbers=new int[total];
        int sum=0;
        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number: ");
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
double average=(double)sum/total;
        DecimalFormat df=new DecimalFormat("0.0000");
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = "+ df.format(average));





    }
}
