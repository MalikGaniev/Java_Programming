package REPLIT;

import java.util.Scanner;

public class ProfittLoss {
    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW
        String p="";
if(buyPrice<sellPrice){
    p="profit";
}else if(buyPrice>sellPrice){
    p="loss";
}else if(buyPrice==sellPrice){
    p="no loss";
}


else{
    p="loss";
}


return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }
}
