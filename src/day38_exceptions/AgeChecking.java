package day38_exceptions;

public class AgeChecking {
   public static void AgeChecking(int age){
       if(age<0){
           throw new AgeException("Lower than 0",new RuntimeException());
       }
   }

    public static void main(String[] args) {
        AgeChecking(-1);
    }
}
