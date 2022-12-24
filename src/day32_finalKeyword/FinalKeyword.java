package day32_finalKeyword;

import java.time.LocalDate;



class Student{
    public void language(){
        System.out.println("Java programing");
    }
}
public class FinalKeyword extends Student {

   /* public void language(){Final method can never be overriten
        System.out.println("Python programing");
    }*/

public FinalKeyword(){

}
    public  static void main(String[] args) {
       final char gender='M';
        System.out.println(gender);//M
        System.out.println(gender);//F
        System.out.println("----------------------------------");
        LocalDate dateOfBirth=LocalDate.now();
        System.out.println(dateOfBirth);
        dateOfBirth=dateOfBirth.plusYears(1);
new FinalKeyword().language();
new Student().language();
        System.out.println("----------------------------------");

       final String name="James";
        //name=null;
      //  name="Daniel";
        System.out.println(name);



    }
}
