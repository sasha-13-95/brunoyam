package Module16.Middle1.Drink;


public class Tea extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Готовим Ваш чай");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем ваш чай в чашку");
    }
}
