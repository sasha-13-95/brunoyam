package Module16.Middle2.WB;

import Module16.Middle2.Facade;

import java.util.ArrayList;
import java.util.List;

public class WildberriesAccount {
    private List<Facade.Order> userOrders;
    private String username;
    private int count;

    public WildberriesAccount(String username) {
        this.username = username;
    }

    public void makeAnOrder(String ordername, double price) {
        if (userOrders == null) {
            userOrders = new ArrayList<>();
            userOrders.add(new Facade.Order(ordername, price));
        } else {
            userOrders.add(new Facade.Order(ordername, price));
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    public List<Facade.Order> getUserOrders() {
        return userOrders;
    }
}
