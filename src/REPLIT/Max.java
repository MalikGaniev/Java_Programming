package REPLIT;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


    public static int max(int x, int y){
        // WRITE YOUR METHOD BELOW
        int r;
if(x>y){
    r=x;
}else{
    r=y;

}
return r;
    }
}

