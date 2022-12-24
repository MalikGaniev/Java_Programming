package day017_CustomClass;

public class EmployeeWork {
    public static void main(String[] args) {
        Employee test1=new Employee();
       test1.setInfo("Malik",20,"SDET",100.000,"0453252454",'M');
Employee test2=new Employee();
test2.setInfo("Muhtar",26,"Teacher",1.000000,"5345345353",'F');
        Employee test3=new Employee();
        test3.setInfo("Sumeye",28,"Java developer",95000,"95434534534",'F');
test3.name="Michael";

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

        test1.Work();  test2.Work();  test3.Work();
    }

}
