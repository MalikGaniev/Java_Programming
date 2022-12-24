package day018_garbageCollector;

public class CheckBankAccountObject {
    public static void main(String[] args) {
        BankAccount n1=new BankAccount();
        n1.setInfo("Malik",023);
        System.out.println(n1);
        n1.deposit(1000);
     n1.checkBalance();
    n1.withDraw(700);
        System.out.println("-------------------");
 n1.deposit(-10);
        n1.checkBalance();

        n1.withDraw(50000);
        System.out.println("------------------------");
        BankAccount account1=new BankAccount();

        BankAccount account2=new BankAccount();
        account1.setInfo("Luke",123);
        account2.setInfo("Malik",321);
        account1.deposit(5000);
        account2.deposit(10000);
        System.out.println(account1);
        System.out.println(account2);
        account1.withDraw(1000);
    }
}
