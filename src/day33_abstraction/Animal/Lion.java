package day33_abstraction.Animal;

public class Lion extends Animal{
    public Lion(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating Lion food");
    }
}
