package application;

import model.entities.Account;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account number:");
        int number = sc.nextInt();
        System.out.println("Account holder:");
        String holder = sc.next();
        System.out.println("Initial Balance:");
        double balance = sc.nextDouble();
        System.out.println("withdraw limit:");
        double withlimit = sc.nextInt();

        Account account = new Account(number,holder,balance,withlimit);

        System.out.println("Enter the amount for withdraw:");
        double amount = sc.nextInt();
        account.withdraw(amount);
        System.out.println("New balance:" + balance);
    }
}
