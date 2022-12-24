package day32_finalKeyword.carTask_methodOverriding;

import day013_CustomMethodsContinue.Test;

public class TestCarObject {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry","Blue",25000,2020);
        Honda honda=new Honda("Accord","Gray",24000,2019);
        Audi audi=new Audi("Q6","Silver",30000,2021);
        Tesla tesla=new Tesla("Model 3","White",60000,2022);
        BMW bmw=new BMW("x6","White",60000,2022);
        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("---------------------------------");
toyota.start();
honda.start();
audi.start();
tesla.start();
bmw.start();
        System.out.println("---------------------------------");
    //tesla.setPrice(3000); Error
        //tesla.setModel("Model H"); Error
        System.out.println(tesla);



    }
}
