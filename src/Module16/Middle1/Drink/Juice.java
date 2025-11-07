package Module16.Middle1.Drink;


public class Juice extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Готовим Ваш сок");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем Ваш сок в стакан");
    }
}
