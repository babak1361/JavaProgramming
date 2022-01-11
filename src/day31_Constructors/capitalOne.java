package day31_Constructors;

public class capitalOne {
    public static void main(String[] args) {
       bankAccount account1 = new bankAccount();// bankAccount is a constructor
       account1.setInfo("Ahmet Ozkok",123456789,0);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.deposit(900);
        account1.checkBalance();

        bankAccount account2 =new bankAccount();
        account2.setInfo("Aygun",987456123,0);

        account2.deposit(10000);
        account2.checkBalance();

        account2.withdraw(100);
        account2.checkBalance();





    }
}
