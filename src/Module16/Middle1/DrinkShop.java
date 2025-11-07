package Module16.Middle1;

import Module16.Middle1.Drink.*;

public class DrinkShop {
    public Drink orderDrink(String type) {
        Drink drink = null;

        if ("coffee".equals(type)) {
            drink = new Coffee();
        }
        if ("juice".equals(type)) {
            drink = new Juice();
        }
        if ("alcohol".equals(type)) {
            drink = new Alcohol();
        }
        if ("tea".equals(type)) {
            drink = new Tea();
        }

        drink.makeDrink();
        drink.pourIntoCup();

        System.out.println("Вот ваш напиток! Спасибо, приходите еще!");
        return drink;
    }
}
