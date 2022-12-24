package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(10);
        BuyAlchocol(25);
GradeOfStudent(90);

    }

    // the method takes an argument number,and vertifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }
        }
    public static void BuyAlchocol(int score){
       if(score>=21){
           System.out.println("Eligible to buy");
       }else{
           System.out.println("Not eligible to buy alcohol");
       }


    }

  public static void GradeOfStudent(int grade){
        if(grade>0&&grade<=100){
            if (grade>=90){
                System.out.println("A");
            }else if(grade>=80){
                System.out.println("B");
            }else if(grade>=70){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }else {
            System.out.println("Not Eligible grade");
        }
  }







    }







