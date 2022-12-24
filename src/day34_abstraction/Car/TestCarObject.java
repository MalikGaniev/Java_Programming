package day34_abstraction.Car;

public class TestCarObject {
    public static void main(String[] args) {
        //Car car1=new Car("x6","Red",2020,45000); Abstract class cannot
   Honda honda=new Honda("Pilot","Black",2019,35000);
   Audi audi=new Audi("Q6","Silver",2020,2020);
   Tesla tesla=new Tesla("Model Y","Blue",2022,60000);
        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);
        System.out.println("------------------------------");
        tesla.start();
        audi.start();
        honda.start();
        System.out.println("-----------------------");
        audi.autoPark();
        tesla.autoPilot();
    }
}
