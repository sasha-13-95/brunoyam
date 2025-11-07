package Module16.Middle3;

import Module16.Middle3.Payment.*;

public class Main {
    public static void main(String[] args) {
        Payment mirPayment = new MirPayment();
        Payment sbpPayment = new SBPPayment();
        mirPayment.setNext(sbpPayment);
        mirPayment.pay(900);
    }
}

