package day013_CustomMethodsContinue;

public class ReturnStatement {

    public static void main(String[] args) {

    }

public static void eligible(int age){

        if(age<0||age>150){
            System.out.println("Invalid age:"+age);
            return;  //exits the method
            // if the age is invalid then this method gets terminated
        }

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }


}
}
