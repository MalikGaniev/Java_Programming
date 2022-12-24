package day06_ifStatements;

public class OxygenTank {
    public static void main(String[] args) {
      int num = 75;
      String result = "";
  if(num >=90){
      result = "Your tank is full";
  }
        if(num >=80 && num <90){
            result = "Still okay";
        }
        if(num >=70 && num <80){
            result = "Dont go too far";
        }
        if(num >=60 && num <70){
            result = "Start to head back";
        }
        if(num >=50 && num <60){
            result = "Be careful now you at 50%";
        }
        System.out.println(result);











    }
}
/*
 Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
