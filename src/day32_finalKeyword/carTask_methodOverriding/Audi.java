package day32_finalKeyword.carTask_methodOverriding;

public class Audi extends Car{
    public Audi(String model, String color, double price, int year) {
        super(model, color, price, year);
    }



    public void start() {
        System.out.println("Press the start button "+getMake()+" "+getModel());
    }
}
/*
  3. Audi
           start(): "Press the start button"
 */