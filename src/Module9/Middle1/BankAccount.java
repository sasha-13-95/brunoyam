package Module9.Middle1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void push(int money) {
        if (balance - money < 0) {
            System.out.println("Операция не выполнена, на карте недостаточно средств");
        }
        if (balance - money > 0) {
            balance -= money;
            System.out.println("Операция выполнена, на карте " + balance);
        }
    }

    public void pop(int money) {
        balance += money;
        System.out.println("На карте " + balance);
    }
}
