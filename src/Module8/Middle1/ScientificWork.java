package Module8.Middle1;


import java.util.Scanner;

import static Module8.Middle1.Library.*;

public class ScientificWork extends Material {
    private Scanner scan = new Scanner(System.in);
    private String titleOfTheReturnedScWork;
    private String titleOfTheGivenOutScWork;

    @Override
    public void addMaterial() {
        System.out.println("Какую научную работу вы хотите отдать?");
        titleOfTheReturnedScWork = scan.nextLine();
        System.out.println("В библиотеке есть научная работа " + titleOfTheReturnedScWork);
        quantityOfMaterials++;
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    @Override
    public void giveAwayTheMaterial() {
        boolean foundAMaterial = false;
        System.out.println("Какую научную работу вы хотите взять?");
        titleOfTheGivenOutScWork = scan.nextLine();
        for (int i = 0; i < materials.size(); i++) {
            if (titleOfTheGivenOutScWork.equals(materials.get(i).getTitleOfTheReturnedMaterial())) {
                System.out.println("Выдаем научную работу " + titleOfTheGivenOutScWork);
                materials.remove(i);
                quantityOfMaterials--;
                foundAMaterial = true;
            }
        }
        if (!foundAMaterial) {
            System.out.println("В библиотеке нет научной работы " + titleOfTheGivenOutScWork);
        }
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    public String getTitleOfTheReturnedMaterial() {
        return titleOfTheReturnedScWork;
    }
}


