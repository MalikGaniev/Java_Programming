package day33_abstraction.Animal;

public abstract class Animal {
    private String name;
    private String breed;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public abstract void eat();

    public Animal(String name, String breed, char gender) {
        setName(name);
        setBreed(breed);
        setGender(gender);
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                '}';
    }
}
/*
name,breed,Gender,eat()
 */