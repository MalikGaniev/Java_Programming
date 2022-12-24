package day25_constructor;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {


    Person Max=new Person("Max",20,'M', LocalDate.of(2002,07,25),true,true);
        System.out.println(Max);
        Max.eat("Burger");
        Max.sleeping(10);
        Max.drink("Cola");

}}
