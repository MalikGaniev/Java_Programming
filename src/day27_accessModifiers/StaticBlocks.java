package day27_accessModifiers;

public class StaticBlocks {
    public StaticBlocks(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static Block");

    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new StaticBlocks();
        new StaticBlocks();
        new StaticBlocks();
    }
}
