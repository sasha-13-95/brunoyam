package Module15.Hard1;

import java.util.*;

public class Main {
    public static void bubbleSort(List<Thing> allMyThings) {
        for (int i = 0; i < allMyThings.size(); i++) {
            for (int j = 0; j < allMyThings.size() - 1; j++) {
                if (allMyThings.get(j).getValue() < allMyThings.get(j + 1).getValue()) {
                    Thing temp = allMyThings.get(j + 1);
                    allMyThings.set(j + 1, allMyThings.get(j));
                    allMyThings.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        List<Thing> allMyThings = new ArrayList<>();
        System.out.println("Какие вещи у тебя есть?");
        while (true) {
            System.out.println("Введи название вещи и ее стоимость");
            Thing thing = new Thing(scanner.next(), scanner.nextInt());
            allMyThings.add(thing);
            System.out.println("Продолжить добавление вещей: да или нет");
            String answer = scanner.next();
            if (answer.matches("^[Нн][Ее][Тт]$")) break;
            if (!answer.matches("^[Дд][Аа]$"))
                throw new IllegalArgumentException("Вы ввели некорректное значение");
        }
        bubbleSort(allMyThings);
        System.out.println("Какое количество вещей вместится в ваш рюкзак?");
        Backpack myBackpack = new Backpack(scanner.nextInt());
        myBackpack.addItemToBackpack(allMyThings);
        System.out.println("Общая стоимость вещей в рюкзаке = " + myBackpack.getCountValue());
    }
}
