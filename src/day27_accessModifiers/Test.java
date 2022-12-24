package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticInitilizationBlock.e);
        System.out.println(StaticInitilizationBlock.b);
        System.out.println(StaticInitilizationBlock.c);
        System.out.println("--------------------------------");
        System.out.println(AccessModifiers.publicDate);//public is accessible withing same package
        System.out.println("-------------------------------------------");
        System.out.println(AccessModifiers.protectedDate);//protected is accessible withing same package
        System.out.println("-------------------------------------");
        System.out.println(AccessModifiers.defaultDate);//default is accessible withing same package
        System.out.println("------------------------------------");
       // System.out.println(AccessModifiers.privateDate);//private NEVER is accessible withing same package
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccesModifiers.privateMethod();


    }
}
