package day09;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your month");
        String result = "Invalid number";
       int num= input.nextInt();
       if(num>=1&&num<=12){
           result=(num==1)?"January":(num==2)?"February":(num==3)?"March":(num==4)?"April"
                   :(num==5)?"May":(num==6)?"June":(num==7)?"July":(num==8)?"August"
                   :(num==9)?"September":(num==10)?"October":(num==11)?"November"
                   :"December";
           System.out.println(result);


       }else{
           result="Invalid number";
       } input.close();




    }
}
