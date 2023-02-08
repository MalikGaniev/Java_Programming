package GroupWork;

public class SwapNumber {


    public static void main(String[] args) {
        int x=25;
        int y=50;

        x=x+y; //x=75
        y=x-y;//y=25
        x=x-y;//x=50
        System.out.println(x);
        System.out.println(y);
dosum(10,20);
dosum(10.0,20.0);

        }
        public static void dosum(Integer x,Integer y){
            System.out.println("IN"+(x+y));
        }
    public static void dosum(double x,double y){
        System.out.println("double"+(x+y));
    }
    public static void dosum(float x,float y){
        System.out.println("float"+(x+y));
    }
    public static void dosum(int x,int y){
        System.out.println("int"+(x+y));
    }


}



