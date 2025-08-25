package Module9.Middle4;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevator {
    private Scanner scanner = new Scanner(System.in);
    private static final int WEIGHT_LIMIT = 500;
    private static int remainingSpace = WEIGHT_LIMIT;
    private boolean isEnable;
    private ArrayList<Cargo> cargoArray;
    private int floor;

    public Elevator() {
        System.out.println("Лифт приехал на твой этаж");
        cargoArray = new ArrayList<>();
    }

    public void elevatorOperation() {
        boolean continueAction = true;
        while (continueAction) {
            System.out.println("Что ты хочешь сделать? Введи 1, если загрузить и отправить лифт\n                             2, если выгрузить лифт");
            String action = scanner.next();
            switch (action) {
                case "1" -> {
                    boolean continueLoading = true;
                    while (continueLoading) {
                        System.out.println("Введи наименование груза");
                        String nameOfTheCargo = scanner.next();
                        System.out.println("Введи номинальный вес груза");
                        int weight = scanner.nextInt();
                        add(nameOfTheCargo, weight);
                        isEnable = checkingLimits(remainingSpace);
                        if (isEnable) {
                            continueLoading = continueCargoLoading();
                        } else {
                            System.out.println("Перевес, отправка лифта невозможна. Разгрузить лифт?");
                            continueAction = correctYesOrNo();
                            if (continueAction) {
                                pop();
                            } else {
                                System.out.println("Перевес, отправка лифта невозможна.");
                                return;
                            }
                        }
                    }
                    push();
                    if (isEnable) {
                        pop();
                    }
                }
                case "2" -> {
                    if (cargoArray.isEmpty()) {
                        System.out.println("Груза в лифте нет");
                        break;
                    }
                    pop();
                }
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("Продолжить?");
            continueAction = correctYesOrNo();
        }
    }

    private boolean checkingLimits(int remainingSpace) {
        if (remainingSpace < 0) {
            isEnable = false;
        } else {
            isEnable = true;
        }
        return isEnable;
    }

    private boolean continueCargoLoading() {
        boolean correctYesOrNo = false;
        boolean continueLoading = false;
        while (!correctYesOrNo) {
            System.out.println("Загрузить еще? Да / Нет");
            String answer = scanner.next();
            if (answer.equals("Да") || answer.equals("да")) {
                continueLoading = true;
                correctYesOrNo = true;
            } else if (answer.equals("Нет") || answer.equals("нет")) {
                continueLoading = false;
                correctYesOrNo = true;
            } else {
                System.out.println("Некорректный ввод, попробуйте снова");
                correctYesOrNo = false;
            }
        }
        return continueLoading;
    }

    private boolean correctYesOrNo() {
        boolean correctYesOrNo = false;
        boolean continueAction = false;
        while (!correctYesOrNo) {
            System.out.println("Да / Нет");
            String answer = scanner.next();
            if (answer.equals("Да") || answer.equals("да")) {
                continueAction = true;
                correctYesOrNo = true;
            } else if (answer.equals("Нет") || answer.equals("нет")) {
                continueAction = false;
                correctYesOrNo = true;
            } else {
                System.out.println("Некорректный ввод, попробуйте снова");
                correctYesOrNo = false;
            }
        }
        return continueAction;
    }

    public void add(String nameOfTheCargo, int weight) {
        Cargo cargo = new Cargo(nameOfTheCargo, weight);
        cargoArray.add(cargo);
        remainingSpace -= weight;
        System.out.println("Вместительность лифта = " + remainingSpace);
    }

    public void push() {
        if (isEnable) {
            System.out.println("На какой этаж отправить лифт?");
            floor = scanner.nextInt();
            System.out.println("Едем на " + floor + " этаж");
        }
    }

    public void pop() {
        for (int i = 0; i < cargoArray.size(); i++) {
            cargoArray.remove(i);
            remainingSpace = WEIGHT_LIMIT;
        }
        System.out.println("Весь груз выгружен, вместительность лифта = " + remainingSpace);
    }
}
