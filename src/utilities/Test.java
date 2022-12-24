package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class Test {
    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);
     Data.method3();
     Data.method4();
     Data obj=new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
obj.method1();
obj.method2();
        System.out.println("---------------------------------------------");
        System.out.println(AccessModifiers.publicDate);//public is always accessible outside of packages
        //System.out.println(AccessModifiers.protectedDate);protected is NOT always accessible outside of packages
      //  System.out.println(AccessModifiers.defaultDate);default is NEVER accessible outside of packages
      //  System.out.println(AccessModifiers.privateDate);private is never accessible outside of class
      //  new AccessModifiers();
    }
}
