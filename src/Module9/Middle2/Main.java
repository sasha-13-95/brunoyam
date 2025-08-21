package Module9.Middle2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("Сколько у тебя банковских счетов?");
        bank.initializationOfAccounts(scanner.nextInt());
        System.out.println("Какую сумму перевести? ");
        bank.push(scanner.nextInt());
    }
}
