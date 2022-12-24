package day25_constructor;

import java.time.LocalDate;

public class Person {
    public String name;
    public  int age;
    public char gender;
    public LocalDate DateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        DateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DateOfBirth=" + DateOfBirth +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
    public void eat(String food){
        System.out.println(name+" eating "+food);
    }
    public void sleeping(int hours){
        System.out.println(name+" is sleeping "+hours);
    }
    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);

    }}
/*
name age gender DateOfBirth,isMarried,isEmployed
 */