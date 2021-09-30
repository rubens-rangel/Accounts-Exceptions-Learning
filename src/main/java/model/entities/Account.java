package model.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withlimit;

    public Account(int number, String holder, double balance, double withlimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withlimit = withlimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithlimit() {
        return withlimit;
    }

    public void setWithlimit(double withlimit) {
        this.withlimit = withlimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.withlimit) {
            throw new RuntimeException("the withdraw exceeds Withdraw Limit");
        }
        if (amount > this.balance) {
            throw new RuntimeException("the withdraw exceeds Account balance");
        }
            this.balance -= amount;
    }
}
