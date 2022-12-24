package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoStudentObject {
    public static void main(String[] args) {


        CydeoStudent cydeoStudent = new CydeoStudent("Malik", 'M', LocalDate.of(2002, 07, 25), "A1", "Zero to hero", 3912);
        System.out.println(cydeoStudent);
        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();
        cydeoStudent.breath();
    }
}
