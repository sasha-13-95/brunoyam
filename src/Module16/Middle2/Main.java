package Module16.Middle2;

import Module16.Middle2.WB.*;

public class Main {
    public static void main(String[] args) {
        WildberriesAccount wildberriesAccount = new WildberriesAccount("Елена");
        WBBank wbBankAccount = new WBBank(wildberriesAccount);
        OrderPickupPoint orderPickupPoint = new OrderPickupPoint();
        WBDeliveryService wbDeliveryService = new WBDeliveryService();

        Facade facade = new Facade(wildberriesAccount, wbBankAccount, wbDeliveryService, orderPickupPoint);
        facade.orderGoodsOnWB();
        facade.operationsAtThePVZ();
    }
}
