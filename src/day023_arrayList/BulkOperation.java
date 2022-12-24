package day023_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {
ArrayList<Integer>number = new ArrayList<>();
number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);


        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,number);

        System.out.println(list1);

        System.out.println("------------------------------");
        ArrayList<Integer>score=new ArrayList<>();
    score.addAll(Arrays.asList(75,80,95,80));

        System.out.println(score);
ArrayList<String>students = new ArrayList<>();
students.addAll( Arrays.asList("Gadir","Hassan","Abidulah","Bilal"));
        System.out.println(students);
students.addAll(2,Arrays.asList("Shukur","Sumeye"));
        System.out.println(students);
        System.out.println("------------------------------");

Integer[]nums={1,2,3,4,5,6,7,8};
ArrayList<Integer>l1=new ArrayList<>(Arrays.asList(nums));
//l1.addAll(Arrays.asList(nums));
        System.out.println(l1);
        System.out.println("-----------------------------------------");

ArrayList<String> employeeList=new ArrayList<>();
employeeList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));
boolean hasAlena=employeeList.contains("Alena");
boolean hasAlenaGadir=employeeList.containsAll(Arrays.asList("Alena","Gadir"));
boolean hasMuhtarAlenaKuzzat=employeeList.containsAll(Arrays.asList("Alena","Muhtar","Kuzzat"));


        System.out.println(employeeList);
        System.out.println(hasAlena);
        System.out.println(hasAlenaGadir);
        System.out.println(hasMuhtarAlenaKuzzat);
ArrayList<Integer>list=new ArrayList<>();
list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,80,10,10,10,20,20,20));
list.removeAll(Arrays.asList(10,20));
        System.out.println(list);

            System.out.println("-------------------------------------------------");
            ArrayList<String> developers=new ArrayList<>();
           developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));
           developers.retainAll(Arrays.asList("Alena","Gadir"));
            System.out.println("------------------------------------------------");
ArrayList<String>groceriesList=new ArrayList<>();
groceriesList.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blue Berry","Paper Towels"));
groceriesList.retainAll(Arrays.asList("Eggs","Potato,","Milk","Tomato" ));
groceriesList.retainAll(Arrays.asList("Rice","Orange","Strawberry","Blue Berry","Paper Towels"));
            System.out.println(groceriesList);

















    }
}
