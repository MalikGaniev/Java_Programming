package day32_finalKeyword.Person;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


    Person person=new Person("Malik",'M', LocalDate.of(1991,1,25));
        System.out.println(person);
        System.out.println("----------------------------------");
        Employee employee=new Employee("Emily",'F',LocalDate.of(1989,2,5),"Accountant",10000);
        System.out.println(employee);
        employee.breath();
}}
