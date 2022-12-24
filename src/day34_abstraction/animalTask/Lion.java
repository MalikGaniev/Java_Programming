package day34_abstraction.animalTask;

public class Lion extends Animal implements Hunt{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating zebra");
    }

    @Override
    public void Hunting() {
        System.out.println("Lion is hunting on zebra");
    }
}
