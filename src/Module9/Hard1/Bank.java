package Module9.Hard1;

import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private int maxLimit;
    private int sumOfMoney = 0;
    private int numberOfAccounts;
    private String accountName;
    private int balance1;
    private int balance2;
    private boolean error;
    private BankAccount[] bankAccounts;

    public Bank() {
        System.out.println("Сколько у тебя счетов?");
        numberOfAccounts = scanner.nextInt();
        bankAccounts = new BankAccount[numberOfAccounts];
        System.out.println("Введи максимальный лимит средств на счетах");
        maxLimit = scanner.nextInt();
    }

    public void bankWork() {
        initializationOfAccounts();
        if (error) {
            return;
        }
        System.out.println("Сколько средств хочешь перевести?");
        push(scanner.nextInt());
    }

    public boolean initializationOfAccounts() {
        for (int i = 0, count = 1; i < bankAccounts.length; i++, count++) {
            System.out.println("Введи название " + count + " счета");
            accountName = scanner.next();
            System.out.println("Сколько средств у тебя на этом счете?");
            int balance = scanner.nextInt();
            if (sumOfMoney + balance <= maxLimit) {
                BankAccount bankAccount = new BankAccount(accountName, balance);
                bankAccounts[i] = bankAccount;
                sumOfMoney += balance;
                error = false;
            } else {
                System.out.println("Ошибка!!! Превышен лимит");
                error = true;
            }
        }
        return error;
    }

    public void push(int money) {
        if (bankAccounts.length < 2) {
            System.out.println("Перевод средств невозможен, для операции нужно наличие минимум 2 счетов");
            return;
        }
        System.out.println("С какого счета ты хочешь перевести средства?");
        String bankAccount1 = scanner.next();
        System.out.println("На какой счет ты хочешь перевести средства?");
        String bankAccount2 = scanner.next();
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccount1.equals(bankAccounts[i].getName())) {
                balance1 = bankAccounts[i].getBalance();
                if (balance1 - money < 0) {
                    System.out.println("Операция не выполнена, на карте недостаточно средств");
                    return;
                }
                if (balance1 - money >= 0) {
                    balance1 -= money;
                }
            }
        }
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccount2.equals(bankAccounts[i].getName())) {
                balance2 = bankAccounts[i].getBalance();
                balance2 += money;
                System.out.println("Операция выполнена, на счете № " + bankAccount2 + " " + balance2 + " рублей.\n На счете № " + bankAccount1 + " " + balance1 + " рублей.");
            }
        }
    }
}

