package day014_forLoop;

public class WarmUp {
    public static void main(String[] args) {


String str3=combine("one","eight");
        System.out.println(str3);
String s1=""+true;
        System.out.println(s1);
    }

    public static String combine(String str1,String str2){
        String result;

        if(str1.endsWith(""+str2.charAt(0) ) ){
            result=str1+str2.substring(1);
        }else{
            result=str1+str2;
        }return result;














}



public static int sumOF2IntegerNumber(int n1,int n2){
       return n1+n2;
}
public static int sumOf3Integers(int n1,int n2,int n3){
        return sumOF2IntegerNumber(n1,n2)+n3;
}
public static int sumOf4Number(int n1,int n2,int n3,int n4){
        return sumOf3Integers(n1, n2, n3)+n4;

        
}



}
/*

Topics:	Method Overloading
		For Loop

package name: day14_forLoop

Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

 */