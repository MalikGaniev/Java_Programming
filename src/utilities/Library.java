package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Library {
    public static void sleep(double sec){
      try{
          Thread.sleep((long) (sec*1000));
      }catch ( InterruptedException e){

      }


    }



    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");
        Thread.sleep(3000);
        System.out.println("First program ended");
        new FileInputStream(" ");

        Thread.sleep(5000);
    }
}
