package day019_Array;

public class minNumber {
    public static void main(String[] args) {

        int[] number={70,20,30,40,5};
        int min=number[0];
        for (int i = 0; i < number.length; i++) {
          if(min>number[i]){
              min=number[i];
          }
        }
        System.out.println("min = " + min);



    }
}
