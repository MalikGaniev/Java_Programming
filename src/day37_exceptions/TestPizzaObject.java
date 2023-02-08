package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {
        Pizza pizza=new Pizza('S',2,3);

        Pizza pizza1=new Pizza('S',2,3);
        System.out.println(pizza1==pizza);
        System.out.println(pizza.equals(pizza1));
Object obj=(Object) new Pizza('L',4,5);//Upcasting
        boolean r=obj.equals(pizza1);
        System.out.println(r);

        double total=((Pizza)obj).calcCost();
        System.out.println(total);

        double area=((Circle)obj).area();
        System.out.println(total);
    }
}
