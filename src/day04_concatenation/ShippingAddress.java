package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Mike AlJoobore",
                streetName = "Coleman avenue",
                city = "Chicago ",
                state = "Illinois",
         buildingNumber = "1324B";
                int zipCode = 15305;

        System.out.println("Your Shipping addres is:\n\t"
        + name + "\n\t"
        + buildingNumber + " " + streetName + "\n\t" + city + ", " + state + " " + zipCode);

        System.out.println("-------------------------------");


        System.out.println("Your shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t"+ city +  ", " + state + " " + zipCode);










    }



}
/*1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
*/
