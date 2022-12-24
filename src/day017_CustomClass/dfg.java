package day017_CustomClass;
import java.util.Scanner;
public class dfg {
     static void main(String[] args){
        //WRITE YOUR CODE BELOW:
        Scanner input=new Scanner(System.in);
        String result="";
        System.out.println("Enter your number:");
        int n1=input.nextInt();
        System.out.println("Enter your number:");
        int n2=input.nextInt();
        System.out.println("Enter your number:");
        int n3=input.nextInt();
        if(n1>n2&&n1<n3||n1<n2&&n1>n3||n2>n1&&n2<n3||n2>n3&&n2<n1||n3>n1&&n3<n2||n3<n1&&n3>n2){

            if(n2>n1&&n2<n3||n2<1&&n2>n3){
                result="middle number is: "+n2;
            }else if (n1>n2&&n1<n3||n1<n2&&n1>n3){
                result="middle number is: "+n1;
            }else{
                result="middle number is: "+n3;
            }


        }else{
            result="number is equal";
        }System.out.println(result);
        input.close();
    }
}
