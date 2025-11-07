package Module16.Middle2.WB;


import Module16.Middle2.Facade;

import java.util.Scanner;

public class WBBank {
    private Scanner scanner = new Scanner(System.in);
    private WildberriesAccount wildberriesAccount;
    private double balance;
    private double amount;


    public WBBank(WildberriesAccount wildberriesAccount) {
        this.wildberriesAccount = wildberriesAccount;
    }

    public void topUpBalance(double amount) {
        balance += amount;
        System.out.println("Баланс пополнен. Баланс = " + balance);
    }

    public boolean balanceCheck() {
        boolean paymentMade;
        for (Facade.Order order : wildberriesAccount.getUserOrders()) {
            amount = amount + order.getPrice();
        }
        if (amount <= balance) {
            paymentMade = true;
        } else {
            paymentMade = false;
        }
        return paymentMade;
    }

    public void financialTransaction() {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Заказ оплачен. Баланс = " + balance);
        } else {
            System.out.println("Операция отклонена, недостаточно средств на счете. Пополните счет");
            topUpBalance(scanner.nextDouble());
            financialTransaction();
        }
    }

    public void refund() {
        balance += amount;
        System.out.println("Осуществлен возврат средств. Баланс = " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
