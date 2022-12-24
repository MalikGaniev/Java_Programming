package day12_customMethods;

public class EmailTask {
    public static void main(String[] args) {
String email ="mike_tyson@gmail.com";

String firstName = email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String rest=email.substring(email.indexOf("@"));


        email=lastName+"_"+firstName+rest;

        System.out.println(email);


    }
}
/*

1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")
        output:
            domain: gmail

 */