package Module16.Middle3.Payment;


public class SBPPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        if (amount >= 100 || amount <= 1000) {
            System.out.println("Платеж осуществлен с помощью платежной системы СБП");
        } else {
            System.out.println("Платеж не может быть обработан. Передаю дальше...");
            passToNext(amount);
        }
    }
}
