package Module9.Middle3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Parking {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private static final int MAX_NUMBER_OF_SEATS = 20;
    private int numberOfSeats = MAX_NUMBER_OF_SEATS;
    private ArrayList<Car> cars;
    private boolean correctYesOrNo;
    private String answer;
    private boolean continueAction = true;
    private String carBrand;
    private String id;
    private boolean correctId;
    private boolean carFound;
    private String action;

    public Parking() {
        System.out.println("Добро пожаловать на парковку. Сейчас у нас " + MAX_NUMBER_OF_SEATS + " свободных мест");
        cars = new ArrayList<>();
    }

    public void parkingIsWorking() {
        while (continueAction) {
            System.out.println("Какое действие ты хочешь совершить? Введи 1, если поставить машину на парковку\n                                          2, если забрать машину с парковки");
            action = scanner.nextLine();
            switch (action) {
                case "1" -> {
                    System.out.println("Какую машину ты хочешь поставить на парковку?");
                    carBrand = scanner.nextLine();
                    pop(carBrand);
                }
                case "2" -> {
                    if (cars.size() == 0) {
                        System.out.println("На парковке нет машин");
                        break;
                    }
                    System.out.println("Какую машину ты хочешь забрать с парковки?");
                    carBrand = scanner.nextLine();
                    System.out.println("Введи id своей машины");
                    id = scanner.nextLine();
                    push(carBrand, id);
                }
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("На парковке осталось " + numberOfSeats + " мест");
            correctYesOrNo();
        }
    }

    private void correctYesOrNo() {
        correctYesOrNo = false;
        while (!correctYesOrNo) {
            System.out.println("Продолжить? Да / Нет");
            answer = scanner.nextLine();
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

    private boolean checkCorrectId(String id) {
        for (int i = 0; i < cars.size(); i++) {
            if (!id.equals(cars.get(i).getId())) {
                correctId = true;
            } else {
                correctId = false;
                break;
            }
        }
        return correctId;
    }

    public void pop(String carBrand) {
        if (numberOfSeats == 0) {
            System.out.println("На парковке нет мест");
            return;
        }
        Car car = new Car(carBrand);
        cars.add(car);
        correctId = false;
        while (!correctId) {
            id = String.valueOf(random.nextInt(1, 21));
            correctId = checkCorrectId(id);
        }
        car.setId(id);
        numberOfSeats -= 1;
        System.out.println("Ты поставил свой автомобиль на парковку, ему присвоили id: " + id);
    }

    public void push(String carBrand, String id) {
        carFound = false;
        for (int i = 0; i < cars.size(); i++) {
            if (carBrand.equals(cars.get(i).getCarBrand()) && id.equals(cars.get(i).getId())) {
                cars.remove(i);
                System.out.println("Ты забрал свой автомобиль");
                numberOfSeats += 1;
                carFound = true;
            }
        }
        if (!carFound) {
            System.out.println("На парковке нет такой машины");
        }
    }
}

