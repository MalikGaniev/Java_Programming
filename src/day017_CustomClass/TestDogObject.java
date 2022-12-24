package day017_CustomClass;

public class TestDogObject {
    public static void main(String[] args) {

     Dog dog1=new Dog();
        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='M';
        dog1.age=4;
        dog1.size="Large";
        dog1.color="Blue";

Dog dog2=new Dog();

dog2.name="Maxim";
dog2.breed="Pitbull";
dog2.gender='W';
dog2.age=5;
dog2.size="Small";
dog2.color="Black";
Dog dog3=new Dog();
        dog3.setInfo("Loki","Chow chow",'M',3,"Medium","Black");

     Dog dog4=new Dog();
     dog4.setInfo("Chuck","Bulldog",'M',5,"Small","White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        dog4.eat();
        dog2.drink();
    }
}
