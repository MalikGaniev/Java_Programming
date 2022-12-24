package day27_accessModifiers;

public class cx {
    public static String name;
    static {
        name="heyo";
    }

    public static void main(String[] args) {
        cx cx =new cx();
        cx.name="yoyo";
        cx newcx=new cx();
        newcx.name="nono";
        cx lastcx=new cx();
        System.out.println(lastcx.name);

    }
}
