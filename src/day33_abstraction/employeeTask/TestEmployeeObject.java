package day33_abstraction.employeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {
        //  Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);
        // We can not create objects from an abstract class, Object MUST be created from  a concrete class
Teacher teacher=new Teacher("James",45,'M',"A3","Math teacher",75000);
        Developer developer=new Developer("Kamal",24,'M',"A2","Java developer",95000,"Java");
        Tester tester=new Tester("Malik",20,'M',"A1","SDET",100000);
        Driver driver=new Driver("Karim",26,'M',"C1","Driver",-1);
        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);
        System.out.println("---------------------------------");
        teacher.work();
        developer.work();
        tester.work();
        driver.work();



    }
}
