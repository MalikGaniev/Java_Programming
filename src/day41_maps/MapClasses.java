package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>();//random order,accept null key&null key
        hashMap.put("Daniel",95000);
        hashMap.put("Emily",95000);
        hashMap.put("Bella",95000);
        hashMap.put("Tesa",95000);
     hashMap.put("Aaron",75000);
hashMap.put("Chris",null);
hashMap.put("Breanna",null);
hashMap.put(null,1200);
        hashMap.put(null,100);
        hashMap.put(null,200);
        System.out.println("hashMap = " + hashMap);
        System.out.println(hashMap);
        Map<String,Integer>LinkedHashMap=new LinkedHashMap<>();//insertion order,accept null key and values
        System.out.println("-------------------------------------------------------");
        LinkedHashMap.put("Daniel",95000);
        LinkedHashMap.put("Emily",null);
        LinkedHashMap.put("Bella",null);
        LinkedHashMap.put(null,95000);
       LinkedHashMap.put(null,75000);
        System.out.println("LinkedHashMap = " + LinkedHashMap);
        System.out.println("---------------------------------");
        Map<String,Integer>treeMap=new TreeMap<>();//sorted order,does not accept null key,accept null value
        treeMap.put("Daniel",95000);
        treeMap.put("Emily",null);
        treeMap.put("Bella",null);//value can be null
       // treeMap.put(null,95000);key can not be null
      //  treeMap.put(null,75000);
        System.out.println("treeMap = " + treeMap);
        Map<String,Integer>hashTable=new Hashtable<>();//random order,does not accept null key and value,Sychronized
        hashTable.put("Daniel",95000);
        hashTable.put("Malik",60000);
        hashTable.put("Aaron",3000);
       // hashTable.put("Emily",null);Value can not be null
        //hashTable.put("Bella",null);
        //hashTable.put(null,95000);key can not be null
       try {
           hashTable.put(null, 75000);
       }catch (RuntimeException e){
           e.printStackTrace();
       }
        System.out.println("hashTable = " + hashTable);

    }
}
/*
pair:name&salary
Daniel=95000
Emily=100000
Bella=85000
 */