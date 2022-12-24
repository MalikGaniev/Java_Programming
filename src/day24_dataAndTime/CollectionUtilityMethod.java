package day24_dataAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethod {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C","C","Ruby","Swift","Swift","Java"));
        System.out.println(names);
       /* for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i,"Python");
            }*/
        //Collections.replaceAll(names,"Java","Python");
        System.out.println(names);
ArrayList<Integer>list=new ArrayList<>();
list.addAll(Arrays.asList(10,20,30,40,50,60,60,70,70,80,80));
int count=Collections.frequency(list,50);
int countJava=Collections.frequency(names,"Java");
        System.out.println(countJava);
ArrayList<Integer>numbers=new ArrayList<>();
numbers.addAll(Arrays.asList(10,20,30,40,40,50,50,50,50,50,60,60,50,50,50));
        for (Integer each : numbers) {
            if(Collections.frequency(numbers,each)==1){
                System.out.println(each);
                String str="aaabbbccccc";
                //a3b4c5
                String result="";


            }
        }
        }

    }

