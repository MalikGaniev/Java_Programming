package day27_accessModifiers;

public class TestCydeoStudentObject {
    public static void main(String[] args) {
        System.out.println(CydeoStudent.schoolName);
        CydeoStudent student=new CydeoStudent("Malik",20,'M');
        CydeoStudent student2=new CydeoStudent("Alena",28,'F');
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student.schoolName);
        System.out.println(student.secretCode);
        System.out.println(student2.schoolName);
        System.out.println(student2.secretCode);
    }
}
