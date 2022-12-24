package day018_garbageCollector;

 class Car {
public String brand;
public String model;
public int year;




}
public class MemoryAllocation {
    public static void main(String[] args) {
      int a=200;//in stack
        Car car=new Car();
        // Stack=   Heap


    }


    public static void method1() {
        int b=100;//in stack
    }
public static void method2(){
        String c ="Hello world";
        //   c=stack     (String literal in side the heap) heap=Hello world



    String d= new String("Hello world");
    //    Stack     Heap         (in the heap but not in the String literal because its new keyword)
}

}