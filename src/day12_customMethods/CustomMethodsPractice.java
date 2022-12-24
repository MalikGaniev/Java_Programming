package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
intial("Mohammed","Ali");
    }


  public static void maxNum(double num1,double num2){
        if(num1>num2){
            System.out.println(num1+" is the maximum number");
        }else if(num2>num1){
            System.out.println(num2+" is the maximum number");}

    else {
        System.out.println("Equal");
    }
}public static void intial(String firstName,String lastName){
        String intial=firstName.charAt(0)+" "+lastName.charAt(0);

        System.out.println("intial is:"+intial);
    }

}
