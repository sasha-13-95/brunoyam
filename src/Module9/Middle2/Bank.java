package Module9.Middle2;


import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private BankAccount[] bankAccounts;
    private int balance1;
    private int balance2;

    public void initializationOfAccounts(int numberOfAccounts) {
        bankAccounts = new BankAccount[numberOfAccounts];
        for (int i = 0, count = 1; i < bankAccounts.length; i++, count++) {
            System.out.println("Введите номер своего " + count + " счета");
            String accountNumber = scanner.next();
            System.out.println("Введите сумму средств на этом счете");
            int balance = scanner.nextInt();
            BankAccount bankAccount = new BankAccount(accountNumber, balance);
            bankAccounts[i] = bankAccount;
        }
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
            if (bankAccount1.equals(bankAccounts[i].getAccountNumber())) {
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
            if (bankAccount2.equals(bankAccounts[i].getAccountNumber())) {
                balance2 = bankAccounts[i].getBalance();
                balance2 += money;
                System.out.println("Операция выполнена, на счете № " + bankAccount2 + " " + balance2 + " рублей.\n На счете № " + bankAccount1 + " " + balance1 + " рублей.");
            }
        }
    }
}