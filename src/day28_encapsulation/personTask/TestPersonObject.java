package day28_encapsulation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Malik",20,'M',"English");
        Person person2 =new Person("Muhtar","English");
        Person person3=new Person("Michael");
        person1.eat("Burger");
        person2.drink("Water");
       Person.printPlanetName();
        person1.planet="Mars";
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
