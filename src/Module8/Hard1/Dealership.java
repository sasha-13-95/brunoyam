package Module8.Hard1;

import java.util.ArrayList;
import java.util.Scanner;


public class Dealership {
    private Scanner scan = new Scanner(System.in);
    public static ArrayList<Car> carPark = new ArrayList<>();
    public static int numberOfCars = 0;
    private String action;
    private String carType;
    private boolean continueAction = true;
    private String answer;
    private boolean correctYesOrNo;
    private Car passengerCar;
    private Car bus;
    private Car specializedEquipment;
    private Car truck;

    public void visitToTheDealership() {
        System.out.println("Добро пожаловать  в наш диллерский центр!");
        while (continueAction) {
            System.out.println("Вы хотите приобрести или продать авто?\n Введите 1, если приобрести \n         2, если продать");
            action = scan.nextLine();
            switch (action) {
                case "1" -> buyACar();
                case "2" -> sellTheCar();
                default -> System.out.println("Некорректные данные");
            }
            correctYesOrNo();
        }
        provisionOfInformation();
        showPrices();
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

    private void buyACar() {
        System.out.println("Какой тип авто Вас интересует\n Введите 1, если легковой автомобиль \n         2, если грузовой автомобиль\n         3, если автобус \n         4, если специализированная техника");
        carType = scan.nextLine();
        switch (carType) {
            case "1" -> {
                if (passengerCar == null) {
                    System.out.println("В нашем центре нет легковых авто");
                    break;
                }
                passengerCar.removeTheCar();
            }
            case "2" -> {
                if (truck == null) {
                    System.out.println("В нашем центре нет грузовых авто");
                    break;
                }
                truck.removeTheCar();
            }
            case "3" -> {
                if (bus == null) {
                    System.out.println("В нашем центре нет автобусов");
                    break;
                }
                bus.removeTheCar();
            }
            case "4" -> {
                if (specializedEquipment == null) {
                    System.out.println("В нашем центре нет спец. техники");
                    break;
                }
                specializedEquipment.removeTheCar();
            }
            default -> System.out.println("Некорректный ввод");
        }
    }

    private void sellTheCar() {
        System.out.println("Какой автомобиль Вы хотите продать \n Введите 1, если легковой автомобиль \n         2, если грузовой автомобиль\n         3, если автобус \n         4, если специализированная техника");
        carType = scan.nextLine();
        switch (carType) {
            case "1" -> {
                passengerCar = new PassengerCar();
                carPark.add(passengerCar);
                passengerCar.addCar();
            }
            case "2" -> {
                truck = new Truck();
                carPark.add(truck);
                truck.addCar();
            }
            case "3" -> {
                bus = new Bus();
                carPark.add(bus);
                bus.addCar();
            }
            case "4" -> {
                specializedEquipment = new SpecializedEquipment();
                carPark.add(specializedEquipment);
                specializedEquipment.addCar();
            }
            default -> System.out.println("Некорректный ввод");
        }
    }

    public void provisionOfInformation() {
        System.out.println("В нашем диллерском центре имеются автомобили: ");
        for (int i = 0; i < carPark.size(); i++) {
            System.out.println(carPark.get(i).getBrand() + " ");
        }
    }

    private void showPrices() {
        int maxPrice = carPark.get(0).getPrice();
        System.out.print("Максимальная цена в нашем центре =  ");
        for (Car car : carPark) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
            }
        }
        System.out.println(maxPrice);
        int minPrice = carPark.get(0).getPrice();
        System.out.print("Минимальная цена в нашем центре = ");
        for (Car car : carPark) {
            if (car.getPrice() < minPrice) {
                minPrice = car.getPrice();
            }
        }
        System.out.println(minPrice);
    }
}
