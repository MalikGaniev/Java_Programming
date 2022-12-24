package day023_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Ali");
        names.add("Marika");

        for (String each:names){
            if(names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }
        }
        boolean hasMuhtar=names.contains("Muhtar");
        boolean hasAli=names.contains("Ali");
        System.out.println(hasAli);
        System.out.println(hasMuhtar);

    }
}
