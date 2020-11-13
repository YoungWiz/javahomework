package homework03;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    // 默认的无参构造方法
    public Account() {
        dateCreated = new Date();
    }

    //创建特定id和初始余额的账户的构造方法
    public Account(int newID, double newBalance) {
        id = newID;
        balance = newBalance;
        dateCreated = new Date();
    }

    //id、balabce和annualInterestRate的构造器和访问器
    public int getId() {
        return id;
    }

    public void setId(int newID) {
        id = newID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    //dataCreated的访问器
    public Date getdateCreated() {
        return dateCreated;
    }

    //返回月利率
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    //提取特定数额
    public void withDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
