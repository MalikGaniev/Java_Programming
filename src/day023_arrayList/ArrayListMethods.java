package day023_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        array[0]=100;
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------------");

        ArrayList<String> groceriest=new ArrayList<>();
        groceriest.add("Eggs");
        groceriest.add("Paper Towels");
        groceriest.add("Apples");
        groceriest.add("Cooking oil");
        System.out.println(groceriest);
        groceriest.set(2,"Orange");
        System.out.println(groceriest);
        groceriest.add(2,"Chicken");
        System.out.println(groceriest);
        groceriest.remove(0);
        System.out.println(groceriest);
        groceriest.remove("Orange");
        System.out.println(groceriest);
        System.out.println("----------------------------");


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        boolean j=numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        groceriest.clear();
        System.out.println(groceriest);

        ArrayList<String> name=new ArrayList<>();
        name.add("Vasyl");
        name.add("Vasyl");
        name.add("Sasyl");
        name.add("Tasyl");
        name.add("Masyl");
        System.out.println(name.indexOf("Vasyl"));
        System.out.println(name.lastIndexOf("Vasyl"));






    }
}
