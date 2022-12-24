package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
        System.out.println("Enter your username:");
       String u=input.next();
        System.out.println("Enter your password:");
      String p=input.next();
    if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){
        System.out.println("Logged in");
    }else {//credentials incorrect
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.println("incorrect username or password,please re-enter");
            } else {
                System.out.println("This your last attempt,Please re-enter your username and password");
            }
            System.out.println("Enter your username:");
            u = input.next();
            System.out.println("Enter your password:");
            p = input.next();
            if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {//if the credentials are valid
                System.out.println("Logged in");

                break;//exits the loop
            }
        }

        if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {//after all attempts,if the username is incorrect
            System.err.println("Your account is locked,please contact with the support team");

            input.close();
        }
    }}
public static void cydeoLogin(String username,String password){
        if(username.equals("Cydeo")&&(password.equals("Wooden Spoon"))){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid password or username");
        }
}

}
