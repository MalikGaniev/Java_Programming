package day38_exceptions;

public class AgeException extends IllegalArgumentException{
    public AgeException(String problem,Throwable cause){
        super(problem,cause);
    }
}
