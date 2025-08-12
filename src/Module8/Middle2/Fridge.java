package Module8.Middle2;

import Module8.Middle2.Products.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Fridge {
    private ArrayList<Product> products = new ArrayList<>();
    private int remainingSpace = 100;
    private boolean freeSpace = true;
    private int quantityOfProduction = 0;
    private String productName;
    private Bread bread;
    private Cucumber cucumber;
    private Milk milk;
    private Sausage sausage;
    private Scanner scan = new Scanner(System.in);

    public void fillingTheFridge() {
        while (remainingSpace > 0) {
            System.out.println("Какой продукт ты хочешь положить в холодильник?\n Введи 1, если хлеб \n       2, если огурец\n       3, если молоко\n       4, если колбаса");
            productName = scan.nextLine();
            switch (productName) {
                case "1" -> {
                    bread = new Bread();
                    putInFrige(bread);
                    if (!freeSpace) {
                        break;
                    }
                    products.add(bread);
                    quantityOfProduction++;
                }
                case "2" -> {
                    cucumber = new Cucumber();
                    putInFrige(cucumber);
                    if (!freeSpace) {
                        break;
                    }
                    products.add(cucumber);
                    quantityOfProduction++;
                }
                case "3" -> {
                    milk = new Milk();
                    putInFrige(milk);
                    if (!freeSpace) {
                        break;
                    }
                    products.add(milk);
                    quantityOfProduction++;
                }
                case "4" -> {
                    sausage = new Sausage();
                    putInFrige(sausage);
                    if (!freeSpace) {
                        break;
                    }
                    products.add(sausage);
                    quantityOfProduction++;
                }
            }
        }
        System.out.println("В холодильнике " + quantityOfProduction + " продукта(-ов)");
    }

    private boolean putInFrige(Product product) {
        if (remainingSpace - product.getVolume() < 0) {
            remainingSpace -= product.getVolume();
            System.out.println("Места в холодильнике больше нет");
            freeSpace = false;
        }
        if (remainingSpace - product.getVolume() >= 0) {
            System.out.println("Ты выбрал " + product.getName() + ", он занимает " + product.getVolume() + " % объема");
            remainingSpace -= product.getVolume();
            System.out.println("Осталось " + remainingSpace + " % объема холодильника");
        }
        return freeSpace;
    }
}
