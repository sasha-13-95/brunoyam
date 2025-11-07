package Module16.Middle1.Drink;

public class Coffee extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Готовим Ваш кофе");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем Ваш кофе в чашку");
    }
}
