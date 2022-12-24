package day26_statics;

import day25_constructor.Person;

public class Iphone {

    public static String brand="Apple";//static because all iphone have the same brand
    public String model;//instance because different models for iphone object
    public String color;
    public double price;
    public static String operatingSystem="IOS";//static because only one OP for all iphone object
    public static String madeIn="China";
    public static boolean hasBattarey=true;
    public static boolean isTouchScreen=true;
    public static boolean isExpensiveToFix=true;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", brand= "+brand+
                ",OP="+operatingSystem+
                ", made in = "+madeIn+
                ", has battery = "+hasBattarey+
                ", Touch screen = "+isTouchScreen+
                ", is expensive = "+isExpensiveToFix+
                '}';
    }/*
    public static void printPhoneInfo(){//static only accept static
        System.out.println("Model: "+model);*/
    public void printPhoneInfo(){
        System.out.println("Model "+model);
        System.out.println("Color "+color);
        System.out.println("Price : "+price);
    }
public static void printOperatingSystem(){
    System.out.println("Operating System: "+operatingSystem);
}
    public static void main(String[] args) {
        Iphone malik=new Iphone("13","Red",1000);
        System.out.println(malik);
        System.out.println(malik.brand);
       Iphone.printOperatingSystem();
        System.out.println(Iphone.brand);

    }
}
/*
Attributes:
brand,model,color,price,operating system,madeIn
 */