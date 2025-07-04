package Module4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите наименование имеющихся продуктов: яйца, молоко, кофе");
        String s = scan.nextLine();
        switch (s) {
            case "яйца, молоко, кофе":
            case "яйца, кофе, молоко":
            case "молоко, яйца, кофе":
            case "молоко, кофе, яйца":
            case "яйца молоко кофе":
            case "яйца кофе молоко":
            case "молоко яйца кофе":
            case "молоко кофе яйца":
                System.out.println("Можно приготовить\n" +
                        "омлет\n" +
                        "яичницу\n" +
                        "кофе");
                break;
            case "молоко, яйца":
            case "яйца, молоко":
            case "молоко яйца":
            case "яйца молоко":
                System.out.println("Можно приготовить омлет");
                break;
            case "молоко, кофе":
            case "кофе, молоко":
            case "молоко кофе":
            case "кофе молоко":
                System.out.println("Можно приготовить кофе");
                break;
            case "яйца":
                System.out.println("Можно приготовить яичницу");
                break;
            default:
                System.out.println("Отсутствуют рецепты");
        }
    }
}
