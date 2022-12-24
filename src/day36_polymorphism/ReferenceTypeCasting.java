package day36_polymorphism;

import Day29_inheritance.AnimalTask.Animal;
import Day29_inheritance.AnimalTask.Cat;
import Day29_inheritance.AnimalTask.Dog;
import day30_Inheritance.phoneTask.IPhone;
import day30_Inheritance.phoneTask.Nokia;
import day30_Inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Driver;
import day33_abstraction.employeeTask.Employee;
import day33_abstraction.employeeTask.Tester;
import day35_polymorphism.TransportationCar.AutoPilot;
import day35_polymorphism.TransportationCar.Electric;
import day35_polymorphism.TransportationCar.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
       // Dog dog=new Dog();
        //Cat cat=new Dog();

        Animal animal=new Dog();
        System.out.println("---------------------------------------------");
        Animal animal1=new Dog();
        animal1.setInfo("Max","Husky",'M',4,"Large","White");


        animal1.eat();
        animal1.drink();
        animal1.sleep();

       Dog dog1= (Dog)animal1;
       dog1.bark();
        //((Cat)animal1).scratch(); //Dog can not be converte to cat,because there is not "IS A"relationship
        System.out.println("----------------------------------");

        Phone phone=new Nokia("XR20","Small","Blue",350);
        ((Nokia)phone).selfDefense();
        ((Nokia) phone).selfDefense();
        System.out.println("--------------------------------------------");

        Employee employee=new Developer("Kamal",24,'M',"A2","Java developer",95000,"Java");
        employee.work();
        ((Developer)employee).getProgramingLanguage();

      //  Tester tester =(Tester) employee;
        //Driver driver=(Driver) employee;
        System.out.println("------------------------------");
        Electric electric=new Tesla("Tesla","Red","Blue",2020,55000);
   electric.charge();



    }
}
