package GroupWork;

public class DividedWithout {
    public static double Divided(double n1, double n2){
       double result=0;
       if(!(n2<=0)){
     while(n1>=n2){
         n1=n1-n2;
         result++;
     }} else{
           throw new ArithmeticException("Invalid number");
       }

return result;
    }

    public static void main(String[] args) {
        System.out.println(Divided(10,-1));
    }



}
