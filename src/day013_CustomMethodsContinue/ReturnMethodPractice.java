package day013_CustomMethodsContinue;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100));
    int num=200;
if(isEven(num)){
    System.out.println(num+" is even number");
}else{
    System.out.println(num+" is odd number");
}
        System.out.println("------------------------------");
        System.out.println("Test started");
boolean exit=true;
if(exit){
 return;    //main method gets terminated
}
        System.out.println("Test Completed");

    }

public static boolean isOdd(int num){
        return (num % 2!=0)? true:false;
}

public static boolean isEven(int num){
        return !isOdd(num);
}

public static int max(int n1,int n2){
    //    return n1>n2?n1:n2;
    if(n1>n2){
        return n1;
    }else{
        return n2;

    }
}

public  static int multiplication(int n1,int n2){
        int result = n1+n2;
        return result;//return the value when exiting the method

}


}

