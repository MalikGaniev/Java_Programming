package day37_exceptions;

import day35_polymorphism.TransportationCar.Car;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Car car=null;
        try{car.drive();}catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
        }
        System.out.println("Program1 ended");
        System.out.println("-----------------------------------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{}catch (RuntimeException e){

        }
    }

}
