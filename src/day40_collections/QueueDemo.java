package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>queue1=new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        //queue1.addAll(Arrays.asList(null,null));
       // System.out.println(queue1.get(3));
        System.out.println("--------------------------------------");
        Queue<Integer>queue2=new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
       // queue2.addAll(Arrays.asList(null,null))
        Queue<Integer>queue3=new LinkedList<>();
        System.out.println("-------------------------------");
        List<Integer>list=new LinkedList<>();
        int num =queue1.poll();//FIFFO
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
       // System.out.println(queue2.get());
        System.out.println(queue1);
        System.out.println("------------------------------------------");
        System.out.println(queue2);
       queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        System.out.println("-----------------------------------------");
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null));
        System.out.println(queue3);
        System.out.println(((LinkedList)queue3).get(4));
        System.out.println("-------------------------");
        List<Integer>list1=new LinkedList<>();
        list1.addAll(Arrays.asList(10,200,300,400,500));
        System.out.println(list1.get(1));
        //((LinkedList)list1).poll();
        System.out.println(list1);
        ((Stack)list1).pop();
    }
}
