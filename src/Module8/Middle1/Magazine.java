package Module8.Middle1;


import java.util.Scanner;

import static Module8.Middle1.Library.*;

public class Magazine extends Material {
    private Scanner scan = new Scanner(System.in);
    private String titleOfTheReturnedMagazine;
    private String titleOfTheGivenOutMagazine;

    @Override
    public void addMaterial() {
        System.out.println("Какой журнал вы хотите отдать?");
        titleOfTheReturnedMagazine = scan.nextLine();
        System.out.println("В библиотеке есть журнал " + titleOfTheReturnedMagazine);
        quantityOfMaterials++;
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    @Override
    public void giveAwayTheMaterial() {
        boolean foundAMaterial = false;
        System.out.println("Какой журнал вы хотите взять?");
        titleOfTheGivenOutMagazine = scan.nextLine();
        for (int i = 0; i < materials.size(); i++) {
            if (titleOfTheGivenOutMagazine.equals(materials.get(i).getTitleOfTheReturnedMaterial())) {
                System.out.println("Выдаем журнал " + titleOfTheGivenOutMagazine);
                materials.remove(i);
                quantityOfMaterials--;
                foundAMaterial = true;
            }
        }
        if (!foundAMaterial) {
            System.out.println("В библиотеке нет  журнала " + titleOfTheGivenOutMagazine);
        }
        System.out.println("В библиотеке хранится " + quantityOfMaterials + " материала(-ов)");
    }

    public String getTitleOfTheReturnedMaterial() {
        return titleOfTheReturnedMagazine;
    }
}
