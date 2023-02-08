package REPLIT;

import java.util.Scanner;

public class Populate {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       populate(n);
    }
    //CREATE YOUR METHOD
    public static void  populate(int n){
        for (int i = 1; i < n+1; i++) {

            System.out.print(i + ",");
        }

}}
