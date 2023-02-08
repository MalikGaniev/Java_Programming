package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,String>map=new TreeMap<>();
        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("DOB","Abidulah");
        map.put("A04","Tatyana");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("A04"));
        map.put("A04","Lucy");
        map.put("B03","Madivar");
        System.out.println(map);
        map.replace("C02","Aseel");
        map.replace("A04","Marika");
        System.out.println(map);
    map.remove("A05");
        System.out.println(map);
        System.out.println(map.containsKey("B03"));
        System.out.println(map.containsKey("H98"));
        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Muhtar"));
    }

}
/*
pair:id-name
 */