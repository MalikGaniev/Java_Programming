package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {


        int a =2000;
        int b = 200;

       //System.out.println(a > b);
        boolean aItsGreater = a > b;
        System.out.println(aItsGreater);

        System.out.println("----------------------------");

        int score=60;
        boolean passed = score >= 60;

        System.out.println(passed);
        System.out.println("-----------------------------------");
        int age = 21;
        boolean eligibleToBuyAlcohol = age>=21;
        System.out.println(eligibleToBuyAlcohol);
        boolean eligibleToVote = age >+18;
        System.out.println(eligibleToVote);
        System.out.println("-----------------------------------");

        System.out.println( 100 > 100);//false
        System.out.println(100>=100);// true
        System.out.println(100 >= 85);//true

        System.out.println("------------------------------");

        score = 48;
        boolean failed = score < 60;

        System.out.println(failed);
        System.out.println("------------------------------");
        System.out.println(100 < 2000);//true
        System.out.println(100 < 20);//false
        System.out.println("------------------------------");
        System.out.println(95 <= 100);//true

        System.out.println(100 <= 100);

        System.out.println(10 <=5);
        System.out.println("-------------------");

        //System.out.println("Java" <="C#"); // >, <, <=, =>,can only be applicable for numbers

        System.out.println('a'>'b');
        //                 65 >66






    }







}
