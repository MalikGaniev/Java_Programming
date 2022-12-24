package day019_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        double n1=10.56786534;
        System.out.println(df.format(n1));
        System.out.println(n1);


    }
}
