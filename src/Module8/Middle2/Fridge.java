package Module8.Middle2;

import java.util.ArrayList;
import java.util.Scanner;


public class Fridge {
    private ArrayList<Product> products = new ArrayList<>();
    public static int remainingSpace = 100;
    public static boolean freeSpace = true;
    private int quantityOfProduction = 0;
    String productName;
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
                    bread.putInFrige(bread.getProductName(), bread.getProductVolume());
                    if (!freeSpace) {
                        break;
                    }
                    products.add(bread);
                    quantityOfProduction++;
                }
                case "2" -> {
                    cucumber = new Cucumber();
                    cucumber.putInFrige(cucumber.getProductName(), cucumber.getProductVolume());
                    if (!freeSpace) {
                        break;
                    }
                    products.add(cucumber);
                    quantityOfProduction++;
                }
                case "3" -> {
                    milk = new Milk();
                    milk.putInFrige(milk.getProductName(), milk.getProductVolume());
                    if (!freeSpace) {
                        break;
                    }
                    products.add(milk);
                    quantityOfProduction++;
                }
                case "4" -> {
                    sausage = new Sausage();
                    sausage.putInFrige(sausage.getProductName(), sausage.getProductVolume());
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
}
