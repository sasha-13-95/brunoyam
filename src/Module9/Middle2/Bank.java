package Module9.Middle2;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<BankAccount> bankAccounts;
    private int numberOfAccounts;

    public Bank() {
        System.out.println("Сколько счетов у тебя есть?");
        numberOfAccounts = scanner.nextInt();
        bankAccounts = new ArrayList<>(numberOfAccounts);
        for (int i = 0, count = 1; i < numberOfAccounts; i++, count++) {
            System.out.println("Введите номер своего " + count + " счета");
            String accountNumber = null;
            boolean correctAccountNumber = false;
            while (!correctAccountNumber) {
                accountNumber = scanner.next();
                correctAccountNumber = inputValidation(accountNumber);
            }
            System.out.println("Введите сумму средств на этом счете");
            int balance = scanner.nextInt();
            addAccount(accountNumber, balance);
        }
    }

    private boolean inputValidation(String accountNumber) {
        boolean correctAccountNumber = false;
        if (bankAccounts.size() < 2) {
            correctAccountNumber = true;
        }
        if (bankAccounts.size() > 1) {
            for (int i = 0; i < bankAccounts.size(); i++) {
                if (!accountNumber.equals(bankAccounts.get(i).getAccountNumber())) {
                    correctAccountNumber = true;
                } else {
                    System.out.println("Счет с таким номером уже существует, введите другой номер счета");
                    correctAccountNumber = false;
                    break;
                }
            }
        }
        return correctAccountNumber;
    }

    public void selectionOfOperation() {
        boolean continueAction = true;
        while (continueAction) {
            System.out.println("Какую операцию ты хочешь сделать? Введи 1, если добавить еще счет\n                                        2, если осуществить перевод");
            String answer = scanner.next();
            switch (answer) {
                case "1" -> {
                    System.out.println("Введите номер своего счета");
                    String accountNumber = null;
                    boolean correctAccountNumber = false;
                    while (!correctAccountNumber) {
                        accountNumber = scanner.next();
                        correctAccountNumber = inputValidation(accountNumber);
                    }
                    System.out.println("Введите сумму средств на этом счете");
                    int balance = scanner.nextInt();
                    addAccount(accountNumber, balance);
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
        boolean continueAction = false;
        boolean correctYesOrNo = false;
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

    public void addAccount(String accountNumber, int balance) {
        BankAccount bankAccount = new BankAccount(accountNumber, balance);
        bankAccounts.add(bankAccount);
        System.out.println("Счет " + accountNumber + " добавлен");
    }

    public void transfer(String bankAccount1, String bankAccount2, int money) {
        boolean correctAccountNumber1 = false;
        boolean correctAccountNumber2 = false;
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount1.equals(bankAccounts.get(i).getAccountNumber())) {
                correctAccountNumber1 = true;
            }
        }
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount2.equals(bankAccounts.get(i).getAccountNumber())) {
                correctAccountNumber2 = true;
            }
        }
        if (!correctAccountNumber1 || !correctAccountNumber2) {
            System.out.println("Ошибка при введении номера счета");
            return;
        }
        int balance1 = 0;
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccount1.equals(bankAccounts.get(i).getAccountNumber())) {
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
            if (bankAccount2.equals(bankAccounts.get(i).getAccountNumber())) {
                int balance2 = bankAccounts.get(i).getBalance();
                balance2 += money;
                bankAccounts.get(i).setBalance(balance2);
                System.out.println("Операция выполнена, на счете № " + bankAccount2 + " " + balance2 + " рублей.\n На счете № " + bankAccount1 + " " + balance1 + " рублей.");
            }
        }
    }
}