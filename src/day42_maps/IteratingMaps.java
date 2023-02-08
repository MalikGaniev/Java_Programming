package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();//random order,accept null key&null key
        map.put("Daniel",95000);
        map.put("Emily",95000);
        map.put("Bella",95000);

        //Iterating the map by the keys
        for (String eachKey : map.keySet()) {
           map.replace(eachKey,map.get(eachKey)*2);
        }
        System.out.println(map);

        System.out.println("------------------------------------------");


        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
            System.out.println(eachValue);
        }


        System.out.println("--------------------------------------------");
        //Iterating the map by entries

map.entrySet();

        for(Map.Entry<String,Integer> eachEntry:map.entrySet()){
            System.out.println(eachEntry);
        }
        System.out.println("--------------------------------------------");

        for (Map.Entry<String,Integer>eachEntry:map.entrySet()){
            System.out.println(eachEntry);
        }
        System.out.println("------------------------------------------------");

for (Map.Entry<String,Integer>eachEntry:map.entrySet()){
    String eachKey=eachEntry.getKey();
    Integer eachValue=eachEntry.getValue();
    eachEntry.setValue(eachValue+10000);
    System.out.println(eachKey+" : "+eachValue);
}

        System.out.println(map);
    }
}
