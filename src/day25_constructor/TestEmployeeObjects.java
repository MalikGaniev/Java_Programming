package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Employee e1 = new Employee("Malik", 20, 'M', "Sdet", 110000, LocalDate.of(2023, 4, 13));
        System.out.println(e1);
Employee e2=new Employee("Mohammad",31,'M',"Project Manager",12000,LocalDate.of(2022,4,12));
        System.out.println(e2);
    }
}