package Module9.Hard1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private int maxLimit;
    private int sumOfMoney = 0;
    private ArrayList<BankAccount> bankAccounts;

    public Bank() {
        System.out.println("Сколько у тебя счетов?");
        int numberOfAccounts = scanner.nextInt();
        bankAccounts = new ArrayList<>(numberOfAccounts);
        System.out.println("Введи максимальный лимит средств на счетах");
        maxLimit = scanner.nextInt();
        for (int i = 0, count = 1; i < numberOfAccounts; i++, count++) {
            System.out.println("Введи название " + count + " счета");
            String accountName = null;
            boolean correctAccountName = false;
            while (!correctAccountName) {
                accountName = scanner.next();
                correctAccountName = inputValidation(accountName);
            }
            System.out.println("Сколько средств у тебя на этом счете?");
            boolean correctBalance = false;
            while (!correctBalance) {
                int balance = scanner.nextInt();
                correctBalance = addAccount(accountName, balance);
            }
        }
    }

    private boolean inputValidation(String accountName) {
        boolean correctAccountName = false;
        if (bankAccounts.size() < 2) {
            correctAccountName = true;
        }
        if (bankAccounts.size() > 1) {
            for (int i = 0; i < bankAccounts.size(); i++) {
                if (!accountName.equals(bankAccounts.get(i).getName())) {
                    correctAccountName = true;
                } else {
                    System.out.println("Счет с таким номером уже существует, введите другой номер счета");
                    correctAccountName = false;
                    break;
                }
            }
        }
        return correctAccountName;
    }

    public void selectionOfOperation() {
        boolean continueAction = true;
        while (continueAction) {
            System.out.println("Какую операцию ты хочешь сделать? Введи 1, если добавить еще счет\n                                        2, если осуществить перевод");
            String answer = scanner.next();
            switch (answer) {
                case "1" -> {
                    System.out.println("Введите номер своего счета");
                    String accountName = null;
                    boolean correctAccountName = false;
                    while (!correctAccountName) {
                        accountName = scanner.next();
                        correctAccountName = inputValidation(accountName);
                    }
                    System.out.println("Введите сумму средств на этом счете");
                    boolean correctBalance = false;
                    while (!correctBalance) {
                        int balance = scanner.nextInt();
                        correctBalance = addAccount(accountName, balance);
                    }
                }
                case "2" -> {
                    if (bankAccounts.size() < 2) {
                        System.out.println("Перевод средств невозможен, для операции нужно наличие минимум 2 счетов");
                        break;
                    }
                    System.out.println("С какого счета ты хочешь перевести средства?");
                    String bankAccount1 = scanner.next();
                    System.out.println("На какой счет ты хочешь перевести средства?");
                    String bankAccount2 = scanner.next();
                    System.out.println("Какую сумму перевести? ");
                    int money = scanner.nextInt();
                    transfer(bankAccount1, bankAccount2, money);
                }
                default -> System.out.println("Некорректное значение");
            }
            continueAction = correctYesOrNo();
        }
    }

    private boolean correctYesOrNo() {
        boolean correctYesOrNo = false;
        boolean continueAction = false;
        while (!correctYesOrNo) {
            System.out.println("Продолжить? Да / Нет");
            String answer = scanner.next();
            if (answer.equals("Да") || answer.equals("да")) {
                continueAction = true;
                correctYesOrNo = true;
            } else if (answer.equals("Нет") || answer.equals("нет")) {
                continueAction = false;
                correctYesOrNo = true;
            } else {
                System.out.println("Некорректный ввод, попробуйте снова");
                correctYesOrNo = false;
            }
        }
        return continueAction;
    }

    public boolean addAccount(String accountName, int balance) {
        boolean correctBalance;
        if (sumOfMoney + balance <= maxLimit) {
            BankAccount bankAccount = new BankAccount(accountName, balance);
            bankAccounts.add(bankAccount);
            System.out.println("Счет " + accountName + " добавлен");
            sumOfMoney += balance;
            correctBalance = true;
        } else {
            System.out.println("Ошибка!!! Превышен лимит, введи значение меньше, чем " + balance);
            correctBalance = false;
        }
        return correctBalance;
    }

    public void transfer(String bankAccount1, String bankAccount2, int money) {
        boolean correctAccountNumber1 = false;
        boolean correctAccountNumber2 = false;
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount1.equals(bankAccounts.get(i).getName())) {
                correctAccountNumber1 = true;
            }
        }
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount2.equals(bankAccounts.get(i).getName())) {
                correctAccountNumber2 = true;
            }
        }
        if (!correctAccountNumber1 || !correctAccountNumber2) {
            System.out.println("Ошибка при введении номера счета");
            return;
        }
        int balance1 = 0;
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount1.equals(bankAccounts.get(i).getName())) {
                balance1 = bankAccounts.get(i).getBalance();
                if (balance1 - money < 0) {
                    System.out.println("Операция не выполнена, на карте недостаточно средств");
                    return;
                }
                if (balance1 - money >= 0) {
                    balance1 -= money;
                    bankAccounts.get(i).setBalance(balance1);
                }
            }
        }
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount2.equals(bankAccounts.get(i).getName())) {
                int balance2 = bankAccounts.get(i).getBalance();
                balance2 += money;
                bankAccounts.get(i).setBalance(balance2);
                System.out.println("Операция выполнена, на счете № " + bankAccount2 + " " + balance2 + " рублей.\n На счете № " + bankAccount1 + " " + balance1 + " рублей.");
            }
        }
    }
}

