package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
   int a=10,
           b=15,
           c=20;
   boolean aMedian = c<a && b>a || a<b && a>c;
   boolean bMedian = b>a && b<c || b<a && b>c;
   boolean cMedian = c>a && c<b || c<a && c>b;
   boolean equal = a==b || b==c || a==c;
   String result = "";

    if(aMedian){
        result = a+" is median number";
    }
        if(bMedian){
            result = b+" is median number";}
        if(cMedian){
            result = c+" is median number";}

        if(equal){
            result = "is equal";}
        System.out.println(result);






    }
}
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
