package day38_exceptions;

import day33_abstraction.Animal.Lion;
import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello cydeo");
        //Thread.sleep(300);
        Library.sleep(3.5);
        System.out.println("How are u today");

        System.out.println("------------------------------------");
if(LocalTime.now().equals(LocalTime.of(4,0))){
    throw new BreakTimeException();
}

    }
}
