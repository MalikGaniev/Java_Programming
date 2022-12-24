package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.TransportationCar.*;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Animal tiger=new Tiger("Sher khan","Bengal",'M',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
      //  tiger.hunt();
  Animal animal=new Eagle("John","American Eagle",'M',3,"Small","Blue");
        Flyable obj1=new Eagle("John","American Eagle",'M',3,"Small","Blue");
       //obj1.eat
           //     obj1.drink
        Eagle eagle=null;
        Parrot parrot=null;
       Flyable [] birds={eagle,parrot};
       Dolphin dolphin=null;
       Shark shark=null;
       Swim [] fishes={dolphin,shark};
        Dog dog=null;
        Playable[] friendlyAnimals={dog};
        CydeoCar cydeoCar=null;
       // boolean isAnimal=cydeoCar instanceof Animal;
        Car car=new Tesla("Tesla","Model Y","White",2020,55000);
        boolean isTesla=car instanceof Tesla;
        boolean isAudi=car instanceof Audi;
        Boolean isElectric=car instanceof Electric;
        boolean hasAutoPark=car instanceof AutoPark;
        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectric = " + isElectric);
        System.out.println("hasAutoPark = " + hasAutoPark);


    }
}
