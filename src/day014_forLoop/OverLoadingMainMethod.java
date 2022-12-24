package day014_forLoop;

public class OverLoadingMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25);
        main(2.5);
        main(true);
    }



    public static void main(int args){
        System.out.println("B");
    }

    public static void main(double args){
        System.out.println("C");
    }

    public static void main(boolean args){
        System.out.println("D");
    }




}
