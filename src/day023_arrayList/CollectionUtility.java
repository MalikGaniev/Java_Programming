package day023_arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionUtility {
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Collections.max(list);
        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println("max = "+max);
        System.out.println("min = "+min);



        ArrayList<String>items=new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blue Berry","Paper Towels"));
Collections.sort(items);

        System.out.println(items);
        Collections.reverse(items);
        System.out.println(items);

        ArrayList<String>students=new ArrayList<>();
        students.addAll(Arrays.asList("Gadir","Hassan","Abidullah","Bilal"));
        Collections.swap(students,0,1);
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);



    }

}
