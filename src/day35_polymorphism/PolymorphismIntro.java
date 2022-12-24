package day35_polymorphism;

import Day29_inheritance.AnimalTask.Tiger;
import day27_accessModifiers.Circle;
import day33_abstraction.Animal.Cat;
import day33_abstraction.Animal.Dog;
import day33_abstraction.Animal.Lion;
import day33_abstraction.employeeTask.*;
import day34_abstraction.Car.Audi;
import day34_abstraction.Car.Honda;
import day34_abstraction.Car.Tesla;
import day34_abstraction.animalTask.*;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Dog dog=new Dog("Max","Breed",'M');
        Cat cat=new Cat("Max","Husly",'M');
        Tiger tiger=null;
        Eagle eagle=null;
        Lion lion=null;
        Parrot parrot=null;
        Dolphin dolphin=null;
        Shark shark=null;
        Duck duck=null;
       // Animal[]animals={dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};
 //Animal animal=new Dog("Max","Husky",'M');
        System.out.println("----------------------------------------");

        String str="Java";
        Integer n=100;
        Boolean r=false;
        Double d=10.5;

        System.out.println("---------------------------------------------------");



        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

       Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);
       Object[]objects={str,n,r,d,circle,honda,audi,tesla,teacher};
        System.out.println(Arrays.toString(objects));

        Object[] employees={teacher,developer,driver,tester};
Employee obj= new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
obj.work();
    }
}
