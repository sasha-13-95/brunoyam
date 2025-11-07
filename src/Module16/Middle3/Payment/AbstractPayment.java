package Module16.Middle3.Payment;

public abstract class AbstractPayment implements Payment {
    private Payment payment;

    @Override
    public void setNext(Payment payment) {
        this.payment = payment;
    }

    public void passToNext(double amount) {
        if (payment != null) {
            payment.pay(amount);
        } else {
            System.out.println("Платеж не может быть обработан");
        }
    }

    @Override
    public abstract void pay(double amount);
}


