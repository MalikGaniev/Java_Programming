package day018_garbageCollector;

public class PizzaTest {
    public static void main(String[] args) {


    Pizza pizza1=new Pizza();
    pizza1.setInfo('s',2,3);

double total=0;

        for (int i = 0; i < 20; i++) {
            Pizza small=new Pizza();
            small.setInfo('S',2,10);
            total+=small.calcCost();
            Pizza medium=new Pizza();
            medium.setInfo('m',20,5);
            total+=medium.calcCost();
            Pizza Large=new Pizza();
        Large.setInfo('L',4,5);
total+=Large.calcCost();



        }


        System.out.println(total);



}}
