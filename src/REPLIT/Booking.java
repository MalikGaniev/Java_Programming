package REPLIT;

import java.util.Scanner;

public class Booking {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        boolean valid=isAvailable&&year==2018;

        if(month ==7&&day<=8){
            valid=false;
        }
        return valid;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}

