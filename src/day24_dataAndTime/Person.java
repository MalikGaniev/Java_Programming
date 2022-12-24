package day24_dataAndTime;

import java.time.LocalDate;

public class Person {
   public String name;
   public int age;
   public char gender;
   public LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age= dateOfBirth.getYear()-LocalDate.now().getYear();




    }
}
