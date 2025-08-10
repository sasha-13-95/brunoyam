package Module8.Middle1;


import java.util.Scanner;

import static Module8.Middle1.Library.*;


public class Book extends Material {
    private Scanner scan = new Scanner(System.in);
    private String titleOfTheReturnedBook;
    private String titleOfTheGivenOutBook;


    @Override
    public void addMaterial() {
        System.out.println("Какую книгу вы хотите отдать?");
        titleOfTheReturnedBook = scan.nextLine();
        System.out.println("В библиотеке есть книга " + titleOfTheReturnedBook);
        quantityOfMaterials++;
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    @Override
    public void giveAwayTheMaterial() {
        boolean foundAMaterial = false;
        System.out.println("Какую книгу вы хотите взять?");
        titleOfTheGivenOutBook = scan.nextLine();
        for (int i = 0; i < materials.size(); i++) {
            if (titleOfTheGivenOutBook.equals(materials.get(i).getTitleOfTheReturnedMaterial())) {
                System.out.println("Выдаем книгу " + titleOfTheGivenOutBook);
                materials.remove(i);
                quantityOfMaterials--;
                foundAMaterial = true;
            }
        }
        if (!foundAMaterial) {
            System.out.println("В библиотеке нет книги " + titleOfTheGivenOutBook);
        }
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    public String getTitleOfTheReturnedMaterial() {
        return titleOfTheReturnedBook;
    }
}
