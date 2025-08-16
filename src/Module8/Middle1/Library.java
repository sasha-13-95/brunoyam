package Module8.Middle1;


import Module8.Middle1.Materials.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private Scanner scan = new Scanner(System.in);
    private int quantityOfMaterials = 0;
    private ArrayList<Material> materials = new ArrayList<>();
    private Material book;
    private Material magazine;
    private Material newspaper;
    private Material scientificWork;
    private boolean continueAction = true;
    private boolean correctYesOrNo;
    private String material;
    private String action;
    private String answer;
    private String titleOfTheGivenOutMaterial;

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

    public void takeTheMaterial() {
        System.out.println("Что вы хотите взять? \n Введите 1, если книгу \n         2, если газету \n         3, если журнал \n         4, если научные труды");
        material = scan.nextLine();
        switch (material) {
            case "1" -> {
                if (book == null) {
                    System.out.println("В библиотеке нет никаких книг");
                    break;
                }
                System.out.println("Какую книгу вы хотите взять?");
                titleOfTheGivenOutMaterial = scan.nextLine();
                giveAwayTheMaterial(titleOfTheGivenOutMaterial);
            }
            case "2" -> {
                if (newspaper == null) {
                    System.out.println("В библиотеке нет никаких газет");
                    break;
                }
                System.out.println("Какую газету вы хотите взять?");
                titleOfTheGivenOutMaterial = scan.nextLine();
                giveAwayTheMaterial(titleOfTheGivenOutMaterial);
            }
            case "3" -> {
                if (magazine == null) {
                    System.out.println("В библиотеке нет никаких журналов");
                    break;
                }
                System.out.println("Какой журнал вы хотите взять?");
                titleOfTheGivenOutMaterial = scan.nextLine();
                giveAwayTheMaterial(titleOfTheGivenOutMaterial);
            }
            case "4" -> {
                if (scientificWork == null) {
                    System.out.println("В библиотеке нет никаких научных трудов");
                    break;
                }
                System.out.println("Какую научную работу вы хотите взять?");
                titleOfTheGivenOutMaterial = scan.nextLine();
                giveAwayTheMaterial(titleOfTheGivenOutMaterial);
            }
            default -> System.out.println("Введены некорректные данные");
        }
    }

    public void returnOfMaterial() {
        System.out.println("Что вы хотите сдать? \n Введите 1, если книгу \n         2, если газету \n         3, если журнал \n         4, если научные труды");
        material = scan.nextLine();
        switch (material) {
            case "1" -> {
                System.out.println("Какую книгу вы хотите отдать?");
                book = new Book(scan.nextLine());
                materials.add(book);
                System.out.println("В библиотеку возвращена книга " + book.getTitleOfMaterial());
                addQuantityOfMaterials();
            }
            case "2" -> {
                System.out.println("Какую газету вы хотите отдать?");
                newspaper = new Newspaper(scan.nextLine());
                materials.add(newspaper);
                System.out.println("В библиотеку возвращена газета " + newspaper.getTitleOfMaterial());
                addQuantityOfMaterials();
            }
            case "3" -> {
                System.out.println("Какой журнал вы хотите отдать?");
                magazine = new Magazine(scan.nextLine());
                materials.add(magazine);
                System.out.println("В библиотеку возвращен журнал " + magazine.getTitleOfMaterial());
                addQuantityOfMaterials();
            }
            case "4" -> {
                System.out.println("Какой научный труд вы хотите отдать?");
                scientificWork = new ScientificWork(scan.nextLine());
                materials.add(scientificWork);
                System.out.println("В библиотеку возвращена научная работа " + scientificWork.getTitleOfMaterial());
                addQuantityOfMaterials();
            }
            default -> System.out.println("Введены некорректные данные");
        }
    }

    private void addQuantityOfMaterials() {
        quantityOfMaterials++;
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    private void giveAwayTheMaterial(String titleOfTheGivenOutMaterial) {
        boolean foundAMaterial = false;
        for (int i = 0; i < materials.size(); i++) {
            if (titleOfTheGivenOutMaterial.equals(materials.get(i).getTitleOfMaterial())) {
                System.out.println("Выдаем " + titleOfTheGivenOutMaterial);
                materials.remove(i);
                quantityOfMaterials--;
                foundAMaterial = true;
            }
        }
        if (!foundAMaterial) {
            System.out.println("В библиотеке нет " + titleOfTheGivenOutMaterial);
        }
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }
}
