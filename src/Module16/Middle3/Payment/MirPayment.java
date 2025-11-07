package Module16.Middle3.Payment;

public class MirPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        if (amount < 100) {
            System.out.println("Платеж осуществлен с помощью платежной системы МИР");
        } else {
            System.out.println("Платеж не может быть обработан. Передаю дальше...");
            passToNext(amount);
        }
    }
}

