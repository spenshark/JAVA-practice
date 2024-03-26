package basic.ex.oop;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();
        account.depisit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
