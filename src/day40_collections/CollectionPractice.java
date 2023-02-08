package day40_collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100,200,300,400,500,600,700));
        System.out.println(collection);

       // collection.get(1);
        System.out.println(((ArrayList)collection).get(2));
      //  System.out.println(((Stack)collection).pop());
        System.out.println("----------------------------------");
        Collection<Integer>collection1=new HashSet<>();
        collection1.addAll(Arrays.asList(100,200,300,400,500,600,700,100,100));
        System.out.println(collection1);
        //System.out.println(((ArrayList)collection1).get(4));
        System.out.println(new ArrayList<>(collection1).get(4));
List<Integer>l=new ArrayList<>(collection1);

    }
}
