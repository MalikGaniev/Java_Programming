package day24_dataAndTime;

import day017_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<=4){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("-------------------------------------");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list2);
    list2.removeIf( p->p<4);
        System.out.println(list2);
        System.out.println("-------------------------------------");
ArrayList<String>names=new ArrayList<>();
names.addAll(Arrays.asList("Java","Python","C#","Java","Ruby","C"));
        names.removeIf(each->each.startsWith("J"));
        System.out.println(names);
        System.out.println("------------------------");
        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, "Java Developer", 100000,  "A01",'M');
        employees.get(1).setInfo("Emily", 40, "SDET", 70000,  "A02",'M');
        employees.get(2).setInfo("Conor", 38, "Project Manager", 1000,  "A03",'M');
        employees.get(3).setInfo("Bella", 29, "Java Developer", 1000,  "A04",'M');
        employees.get(4).setInfo("Jimmy", 54, "Data Analyst", 1000,  "A05",'F');
       employees.removeIf(each->each.salary<90000);
        System.out.println(employees);




    }
}
/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer
            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */