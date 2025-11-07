package Module16.Middle1.Drink;

public class Alcohol extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Готовим Ваш алкогольный напиток");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем Ваш алкогольный напиток");
    }
}
