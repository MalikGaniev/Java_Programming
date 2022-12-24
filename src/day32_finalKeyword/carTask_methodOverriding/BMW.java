package day32_finalKeyword.carTask_methodOverriding;

public class BMW extends Car{
    public BMW(String model, String color, double price, int year) {
        super(model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start "+getMake()+" "+getModel());
    }
}
/*
 4. BMW
         start(): "Call the mechanic or jump start"
 */