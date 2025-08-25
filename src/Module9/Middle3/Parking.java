package Module9.Middle3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Parking {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private static final int MAX_NUMBER_OF_SEATS = 20;
    private static int numberOfSeats = MAX_NUMBER_OF_SEATS;
    private ArrayList<Car> cars;

    public Parking() {
        System.out.println("Добро пожаловать на парковку. Сейчас у нас " + MAX_NUMBER_OF_SEATS + " свободных мест");
        cars = new ArrayList<>();
    }

    public void parkingIsWorking() {
        boolean continueAction = true;
        while (continueAction) {
            System.out.println("Какое действие ты хочешь совершить? Введи 1, если поставить машину на парковку\n                                          2, если забрать машину с парковки");
            String action = scanner.nextLine();
            switch (action) {
                case "1" -> {
                    System.out.println("Какую машину ты хочешь поставить на парковку?");
                    pop(scanner.nextLine());
                }
                case "2" -> {
                    if (cars.size() == 0) {
                        System.out.println("На парковке нет машин");
                        break;
                    }
                    System.out.println("Какую машину ты хочешь забрать с парковки?");
                    String carBrand = scanner.nextLine();
                    System.out.println("Введи id своей машины");
                    String id = scanner.nextLine();
                    push(carBrand, id);
                }
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("На парковке осталось " + numberOfSeats + " мест");
            continueAction = correctYesOrNo();
        }
    }

    private boolean correctYesOrNo() {
        boolean correctYesOrNo = false;
        boolean continueAction = false;
        while (!correctYesOrNo) {
            System.out.println("Продолжить? Да / Нет");
            String answer = scanner.nextLine();
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

    private boolean checkCorrectId(String id) {
        boolean correctId = false;
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
        boolean correctId = false;
        String id = null;
        while (!correctId) {
            id = String.valueOf(random.nextInt(1, 21));
            correctId = checkCorrectId(id);
        }
        car.setId(id);
        numberOfSeats -= 1;
        System.out.println("Ты поставил свой автомобиль на парковку, ему присвоили id: " + id);
    }

    public void push(String carBrand, String id) {
        boolean carFound = false;
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

