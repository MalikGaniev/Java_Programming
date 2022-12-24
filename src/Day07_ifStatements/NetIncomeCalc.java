package Day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

       int salary = 200_000;
        boolean isMarried = false;
      double TaxRate=0;

      if(salary>=130000){//if the salary is 130k or more,then tax rate should be 35%
          TaxRate=0.35;
      }
        if(salary>=100000&&salary<=130000){
            TaxRate=0.3;
        }
        if(salary>=80000&&salary<100000){
            TaxRate=0.25;
        }
        if(salary<=80000){
            TaxRate=0.2;
        }

        if(isMarried){//if the person is married
            TaxRate -= 0.05;//tax is reduced by 5%
        }

double totalTax=salary*TaxRate;
        double netIncome = salary*(1-TaxRate);
        System.out.println("salary = "+salary);
        System.out.println("totalTax = "+ totalTax);
        System.out.println("netIncome "+netIncome);




    }
}
/*

    3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

 */
