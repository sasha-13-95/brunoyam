package Module8.Middle1;


import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private Scanner scan = new Scanner(System.in);
    public static int quantityOfMaterials = 0;
    public static ArrayList<Material> materials = new ArrayList<>();
    private Material book;
    private Material magazine;
    private Material newspaper;
    private Material scientificWork;
    private boolean continueAction = true;
    private boolean correctYesOrNo;
    private String material;
    private String action;
    private String answer;

    public void libraryWork() {
        while (continueAction) {
            System.out.println("Что вы хотите сделать? \n Введите 1, если отдать \n         2, если взять");
            action = scan.nextLine();
            switch (action) {
                case "1" -> returnOfMaterial();
                case "2" -> takeTheMaterial();
                default -> System.out.println("Некорректные данные");
            }
            correctYesOrNo();
        }
    }

    private void correctYesOrNo() {
        correctYesOrNo = false;
        while (!correctYesOrNo) {
            System.out.println("Продолжить? Да / Нет");
            answer = scan.nextLine();
            if (answer.equals("Да") || answer.equals("да")) {
                continueAction = true;
                correctYesOrNo = true;
            } else if (answer.equals("Нет") || answer.equals("нет")) {
                continueAction = false;
                correctYesOrNo = true;
            } else {
                System.out.println("Некорректный ввод, попробуй снова");
                correctYesOrNo = false;
            }
        }
    }

    private void takeTheMaterial() {
        System.out.println("Что вы хотите взять? \n Введите 1, если книгу \n         2, если газету \n         3, если журнал \n         4, если научные труды");
        material = scan.nextLine();
        switch (material) {
            case "1" -> {
                if (book == null) {
                    System.out.println("В библиотеке нет никаких книг");
                    break;
                }
                book.giveAwayTheMaterial();
            }
            case "2" -> {
                if (newspaper == null) {
                    System.out.println("В библиотеке нет никаких газет");
                    break;
                }
                newspaper.giveAwayTheMaterial();
            }
            case "3" -> {
                if (magazine == null) {
                    System.out.println("В библиотеке нет никаких журналов");
                    break;
                }
                magazine.giveAwayTheMaterial();
            }
            case "4" -> {
                if (scientificWork == null) {
                    System.out.println("В библиотеке нет никаких научных трудов");
                    break;
                }
                scientificWork.giveAwayTheMaterial();
            }
            default -> System.out.println("Введены некорректные данные");
        }
    }

    private void returnOfMaterial() {
        System.out.println("Что вы хотите сдать? \n Введите 1, если книгу \n         2, если газету \n         3, если журнал \n         4, если научные труды");
        material = scan.nextLine();
        switch (material) {
            case "1" -> {
                book = new Book();
                materials.add(book);
                book.addMaterial();
            }
            case "2" -> {
                newspaper = new Newspaper();
                materials.add(newspaper);
                newspaper.addMaterial();
            }
            case "3" -> {
                magazine = new Magazine();
                materials.add(magazine);
                magazine.addMaterial();
            }
            case "4" -> {
                scientificWork = new ScientificWork();
                materials.add(scientificWork);
                scientificWork.addMaterial();
            }
            default -> System.out.println("Введены некорректные данные");
        }
    }
}
