package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate=200;
protected static int protectedDate=300;
static  int defaultDate=400;
private static int privateDate=500;
private AccessModifiers(){}
    public static void publicMethod(){
        System.out.println("Public");
    }
    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    static void defaultMethod(){
        System.out.println("Default");
    }
    private static void privateMethod(){
        System.out.println("Private");
    }
    public static void main(String[] args) {
        System.out.println(publicDate);//public is accessible withing same class
        System.out.println(protectedDate);//protected is accessible withing same class
        System.out.println(defaultDate);//default is accessible withing same class
        System.out.println(privateDate);//default is accessible withing same class
        new AccessModifiers();
        privateMethod();
        publicMethod();
        defaultMethod();
        protectedMethod();
    }

}
