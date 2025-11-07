package Module16.Middle3.Payment;

public interface Payment {
    void setNext(Payment payment);

    void pay(double amount);
}

