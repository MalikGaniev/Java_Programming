package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,5));
Iterator ite=list.iterator();
        System.out.println(ite.hasNext());
        System.out.println(ite.next());
    List<String>names=new LinkedList<>();
    names.addAll(Arrays.asList("Ahmed","AhmeD","ahmed","John","Ercon","DaNiel","Mustafa","Mohammed","Ahmed","ahmed","Yulia","Chris"));

Iterator<String> it=names.iterator();
    while(it.hasNext()){
        String each= it.next();
        if(each.equalsIgnoreCase("ahmed")){
            it.remove();
        }
    }
        System.out.println(names);
        System.out.println("--------------------------------------------");
    List<String>names2=new ArrayList<>();
    names2.addAll(Arrays.asList("Ahmed","AhmeD","ahmed","John","Ercon","DaNiel","Mustafa","Mohammed","Ahmed","ahmed","Yulia","Chris"));


    names2.removeIf(p->p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);

        System.out.println("--------------------------------------------------------");

        List<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,24,56,4,46,7));
        //find the largest number

        int n1=5;

        for(int i=0;i<n1-1;i++)
        {
            numbers.removeIf(p->Collections.max(numbers)==p);
        }
int max=Collections.max(numbers);
        System.out.println(max);
    }}
