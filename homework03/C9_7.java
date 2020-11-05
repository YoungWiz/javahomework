package homework03;

public class C9_7 {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000);
        testAccount.setAnnualInterestRate(4.5 / 100);
        testAccount.withDraw(2500);
        testAccount.deposit(3000);
        System.out.println("The balance is: " + testAccount.getBalance());
        System.out.println("The monthly interest is: " + (testAccount.getBalance() * testAccount.getAnnualInterestRate()/12));
        System.out.println("The date created is: " + testAccount.getdateCreated().toString());
    }
}
