package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String u,p;
int attempt=3;
        do{

            System.out.println("Enter your User Name");
            u=input.next();
            System.out.println("Enter your password");
            p=input.next();
            attempt--;
            if(attempt==0){
                System.out.println("Text support");
                break;
            }
        }while (!(u.equals("Cydeo")&&p.equals("Wooden Spoon")));//While the credentials are invalid



    }
}
