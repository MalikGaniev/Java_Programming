package day36_polymorphism;

public class TestEqualMethod {
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        Circle circle2=new Circle(5);
        System.out.println(circle1==circle2);//False
        System.out.println(circle1.equals(circle2));
        System.out.println("----------------------------------------");
        IPhone iPhone=new IPhone("Apple","Iphone 12","Medium","Red",900);
        IPhone iPhone1=new IPhone("Apple","Iphone 12","Medium","Red",900);

        System.out.println(iPhone.equals(iPhone1));


    }
}
