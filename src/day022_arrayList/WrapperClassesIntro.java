package day022_arrayList;

import day017_CustomClass.Dog;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        String str="Java";
        int a =10;
        Integer a2=10;
        System.out.println("-----------------------------------------------------------");
        int b1=100;
        double c1=b1;
        long c2=b1;
        Integer b2=b1;//AutoBoxing primitive to wrapper class
       // Long b3=b1;
       // Double b4=b1;


        char ch='A';
        Character ch2=ch;//AutoBoxing
        double d1=5.5;

        Double d2=d1;


        System.out.println("---------------------------------");
        Integer n1=20;
        int n2=n1;//unBoxing
        //long n3=n1;
        //double n4=n1;
        Character e1='Z';
        char e2=e1;






    }
}
