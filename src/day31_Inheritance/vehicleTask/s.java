package day31_Inheritance.vehicleTask;

import java.util.ArrayList;

public class s {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        ArrayList<String>cars2=new ArrayList<>();
        cars.add("V");
        cars.add("B");
        cars.add("F");

        cars2.add("V");
        cars2.add("F");
      for(String str:cars2){
          cars.add(str);
      }
      cars.remove("V");
        System.out.println(cars);

    }
}
