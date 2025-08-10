package Module8.Middle1;


import java.util.Scanner;

import static Module8.Middle1.Library.*;

public class Newspaper extends Material {
    private Scanner scan = new Scanner(System.in);
    private String titleOfTheReturnedNewspaper;
    private String titleOfTheGivenOutNewspaper;

    @Override
    public void addMaterial() {
        System.out.println("Какую газету вы хотите отдать?");
        titleOfTheReturnedNewspaper = scan.nextLine();
        System.out.println("В библиотеке есть газета " + titleOfTheReturnedNewspaper);
        quantityOfMaterials++;
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    @Override
    public void giveAwayTheMaterial() {
        boolean foundAMaterial = false;
        System.out.println("Какую газету вы хотите взять?");
        titleOfTheGivenOutNewspaper = scan.nextLine();
        for (int i = 0; i < materials.size(); i++) {
            if (titleOfTheGivenOutNewspaper.equals(materials.get(i).getTitleOfTheReturnedMaterial())) {
                System.out.println("Выдаем газету " + titleOfTheGivenOutNewspaper);
                materials.remove(i);
                quantityOfMaterials--;
                foundAMaterial = true;
            }
        }
        if (!foundAMaterial) {
            System.out.println("В библиотеке нет газеты " + titleOfTheGivenOutNewspaper);
        }
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    public String getTitleOfTheReturnedMaterial() {
        return titleOfTheReturnedNewspaper;
    }
}

