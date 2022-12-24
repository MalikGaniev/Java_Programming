package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionArrayPractice {
    public static void main(String[] args) {

        String[] group1={"Vasya","Javar","Jacksok","Jeson"};
        String[] group2={"Olga","Tanya","Jeffry"};
        String[] group3={"Tanya","Maks","Mendes","Jeson","Huam"};
        String[] group4={"Vasya","Javar"};



        String[][] groups={group1,group2,group3,group4};
///                           0    1       2      3
        for (int i = 0; i < groups.length; i++) {
            String[] each=groups[i];
            System.out.println(Arrays.toString(each));
            for (int i1 = 0; i1 < each.length; i1++) {
                String eachStudent=each[i1];
                System.out.println(eachStudent);
            }
        }
        System.out.println("----------------------------");
        for (String[] eachGroup : groups) {
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------------------------");
        for (int i = groups.length - 1; i >= 0; i--) {
            String []EachGroup=groups[i];
            System.out.println(Arrays.toString(EachGroup));
            for (String EachStudent : EachGroup) {
            }



        }

        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(groups));//toString()==>for single dimensional arrays
        System.out.println(Arrays.deepToString(groups));//for multi dimensional arrays

    }

}