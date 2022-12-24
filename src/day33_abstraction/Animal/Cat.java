package day33_abstraction.Animal;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eating cat food");
    }
}
