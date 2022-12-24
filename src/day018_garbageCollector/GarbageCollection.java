package day018_garbageCollector;

import day017_CustomClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1="Java";
        s1=null;
        System.out.println(s1);
       //System.out.println(s1.toUpperCase());

        String a= "";
        String b=null;
        System.out.println("----------------------------------------------------");
        String str="Python";
        str="CYDEO";
        System.out.println(str);
        System.out.println("--------------------------------");
        Dog dog1=new Dog();
        dog1.setInfo("Loki","Chow",'M',3,"Medium","Black");
        Dog dog2=new Dog();
dog2.setInfo("Michael","ureqwr",'M',3,"Medium","White");
dog1=dog2;
        System.out.println(dog1);
        System.out.println(dog2);
//new Dog().finalize();

    }
}
