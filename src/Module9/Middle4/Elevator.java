package Module9.Middle4;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevator {
    private Scanner scanner = new Scanner(System.in);
    private static final int WEIGHT_LIMIT = 500;
    private int remainingSpace = WEIGHT_LIMIT;
    private String action;
    private String nameOfTheCargo;
    private int weight;
    private boolean isEnable;
    private ArrayList<Cargo> cargoArray = new ArrayList<>();
    private boolean correctYesOrNo;
    private boolean continueAction = true;
    private String answer;
    private int floor;
    private boolean continueLoading = true;

    public void elevatorOperation() {
        while (continueAction) {
            System.out.println("Что ты хочешь сделать? Введи 1, если загрузить и отправить лифт\n                             2, если выгрузить лифт");
            action = scanner.next();
            switch (action) {
                case "1" -> {
                    continueLoading = true;
                    while (continueLoading) {
                        System.out.println("Введи наименование груза");
                        nameOfTheCargo = scanner.next();
                        System.out.println("Введи номинальный вес груза");
                        weight = scanner.nextInt();
                        add(nameOfTheCargo, weight);
                        isEnable = checkingLimits(remainingSpace);
                        if (isEnable) {
                            continueCargoLoading();
                        } else {
                            System.out.println("Перевес, отправка лифта невозможна. Разгрузить лифт?");
                            correctYesOrNo();
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
            correctYesOrNo();
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

    private void continueCargoLoading() {
        correctYesOrNo = false;
        while (!correctYesOrNo) {
            System.out.println("Загрузить еще? Да / Нет");
            answer = scanner.next();
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
    }

    private void correctYesOrNo() {
        correctYesOrNo = false;
        while (!correctYesOrNo) {
            System.out.println("Да / Нет");
            answer = scanner.next();
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
        System.out.println("Весь груз выгружен на " + floor + " этаже, вместительность лифта = " + remainingSpace);
    }
}
