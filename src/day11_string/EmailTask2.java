package day11_string;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";

        int first = email.indexOf('_');
        int last = email.indexOf('@');
        int domainPart = email.indexOf('.');

        String firstName = email.substring(0,first);
        String firstCharName = firstName.replace(firstName.charAt(0),firstName.toUpperCase().charAt(0));
        System.out.println("First Name: " + firstCharName);

        String lastName = email.substring((first)+1,last);
        String lastCharName = lastName.replace(lastName.charAt(0),lastName.toUpperCase().charAt(0));
        System.out.println("Last Name: " + lastCharName);
        String domain = email.substring((last)+1,domainPart);
        System.out.println("Domain: " + domain);

    }
}
/*

9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */