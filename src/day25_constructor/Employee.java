package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name ;
    public int age;
    public char gender;
    public String jobTitle;
    public int salary;
    public LocalDate hired_Date;

    public Employee(String name, int age, char gender, String jobTitle, int salary, LocalDate hired_Date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_Date = hired_Date;
    } // allows  us to set all the instance variables of each object as soon as the object created

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_Date=" + hired_Date.format(DateTimeFormatter.ofPattern("MMMM/dd/y"))+
                '}';
    }
    // allows us to set all the instance
}
/*
name
age
gender
jobTitle
salary
 */