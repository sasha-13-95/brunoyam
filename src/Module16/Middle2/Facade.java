package Module16.Middle2;

import Module16.Middle2.WB.*;

import java.util.Scanner;

public class Facade {
    private Scanner scanner = new Scanner(System.in);
    private WildberriesAccount wildberriesAccount;
    private WBBank wbBankAccount;
    private WBDeliveryService wbDeliveryService;
    private OrderPickupPoint orderPickupPoint;

    public Facade(WildberriesAccount wildberriesAccount, WBBank wbBankAccount, WBDeliveryService wbDeliveryService, OrderPickupPoint orderPickupPoint) {
        this.wildberriesAccount = wildberriesAccount;
        this.wbBankAccount = wbBankAccount;
        this.wbDeliveryService = wbDeliveryService;
        this.orderPickupPoint = orderPickupPoint;
    }

    public void orderGoodsOnWB() {
        while (true) {
            System.out.println("Введите название товара и его цену");
            wildberriesAccount.makeAnOrder(scanner.next(), scanner.nextDouble());
            System.out.println("Продолжить?");
            if (scanner.next().equalsIgnoreCase("нет")) break;
        }
        if (!wbBankAccount.balanceCheck()) {
            System.out.println("Введите сумму пополнения счета");
            wbBankAccount.topUpBalance(scanner.nextDouble());
            wbBankAccount.financialTransaction();
        } else wbBankAccount.financialTransaction();
        System.out.println("Оформлен заказ на " + wildberriesAccount.getCount() + " вещей");
        wbDeliveryService.deliverTheGoods();
    }

    public void operationsAtThePVZ() {
        orderPickupPoint.issueTheGoods();
        System.out.println("Баланс = " + wbBankAccount.getBalance());
        System.out.println("Хотите оформить возврат?");
        if (scanner.next().equalsIgnoreCase("да")) {
            orderPickupPoint.returnTheGoods();
            wbBankAccount.refund();
        }
    }

    public static class Order {
        private String ordername;
        private double price;

        public Order(String ordername, double price) {
            this.ordername = ordername;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
