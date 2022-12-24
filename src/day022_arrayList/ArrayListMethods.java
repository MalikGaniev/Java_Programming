package day022_arrayList;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);
        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(10);//3
        list.add(1,15);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        System.out.println("--------------------------");
ArrayList<String> studentList =new ArrayList<>();
studentList.add("Mohammad");
studentList.add("Abdurasul");
studentList.add("Malik");
        studentList.add("Muhtar");
        System.out.println(studentList.size());
        System.out.println(studentList);
        String first=studentList.get(0);
        System.out.println(first);
        String last=studentList.get(studentList.size()-1);
        System.out.println(last);
    }
}
