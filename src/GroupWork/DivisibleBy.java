package GroupWork;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int b= input.nextInt();
        for (int i = 0; i < b; i++) {
            if(b%3==0&&b%5==0&&b%15==0){
                System.out.println("Divisible By 15 30 45 60 75 90");
                break;
            }else if(b%3==0&&b%15!=0){
                System.out.println("Divisible by 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 47 63 66 69 ");
                break;
            }else if(b%5==0&&b!=15){
                System.out.println("Divisible by 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100");
                break;
            }
        }
    }
}
