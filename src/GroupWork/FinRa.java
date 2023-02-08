package GroupWork;

public class FinRa {
    public static void Finra(int num){
        if(num>=1&&num<=30){
            if(num%5==0&&num%3==0){
                System.out.println("Finra");
            }else if(num%5==0){
                System.out.println("Ra");
            }else if(num%3==0){
                System.out.println("Fin");
            }
        }else{
            throw new RuntimeException("Invalid number");
        }



    }

    public static void main(String[] args) {
        Finra(-1);
    }
}
/*
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number
 */