package day40_collections;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
            System.out.println(list);
            System.out.println("------------------------------------");
            List<Integer>list1=new ArrayList<>();
            list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
            Iterator<Integer> it=list1.iterator();
            while(it.hasNext()){
               Integer each= it.next();
               if(each<5){
                  it.remove();
               }
            }
            System.out.println(list1);
            System.out.println("-----------------------------------------");

            List<Integer>list3=new ArrayList<>();
            list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
            for(Iterator<Integer> j=list3.iterator();j.hasNext();){
                Integer each=j.next();

                if(each<5){
                    j.remove();
                }

            }
            System.out.println(list3);
            System.out.println("---------------------------------");
            List<Integer>list4=new ArrayList<>();
            list4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            list4.removeIf(each->each<5);
            System.out.println("---------------------------------------");
            List<Integer>list5=new LinkedList<>();
            list5.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
            list5.removeIf(p->p<5);
        }
        }
    }

