package Module8.Hard1;

import Module8.Hard1.Cars.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Dealership {
    private Scanner scan = new Scanner(System.in);
    public static ArrayList<Car> carPark = new ArrayList<>();
    public static int numberOfCars = 0;
    private String action;
    private String carType;
    private String carBrand;
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
            action = scan.next();
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
            answer = scan.next();
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

    public void buyACar() {
        System.out.println("Какой тип авто Вас интересует\n Введите 1, если легковой автомобиль \n         2, если грузовой автомобиль\n         3, если автобус \n         4, если специализированная техника");
        carType = scan.next();
        switch (carType) {
            case "1" -> {
                if (passengerCar == null) {
                    System.out.println("В нашем центре нет легковых авто");
                    break;
                }
                System.out.println("Какую марку авто вы хотите купить?");
                carBrand = scan.next();
                removeTheCar(carBrand);
            }
            case "2" -> {
                if (truck == null) {
                    System.out.println("В нашем центре нет грузовых авто");
                    break;
                }
                System.out.println("Какую марку авто вы хотите купить?");
                carBrand = scan.next();
                removeTheCar(carBrand);
            }
            case "3" -> {
                if (bus == null) {
                    System.out.println("В нашем центре нет автобусов");
                    break;
                }
                System.out.println("Какую марку авто вы хотите купить?");
                carBrand = scan.next();
                removeTheCar(carBrand);
            }
            case "4" -> {
                if (specializedEquipment == null) {
                    System.out.println("В нашем центре нет спец. техники");
                    break;
                }
                System.out.println("Какую марку авто вы хотите купить?");
                carBrand = scan.next();
                removeTheCar(carBrand);
            }
            default -> System.out.println("Некорректный ввод");
        }
    }

    public void sellTheCar() {
        System.out.println("Какой автомобиль Вы хотите продать \nВведите  1, если легковой автомобиль \n         2, если грузовой автомобиль\n         3, если автобус \n         4, если специализированная техника");
        carType = scan.next();
        switch (carType) {
            case "1" -> {
                System.out.println("Введите марку вашего легкового автомобиля и его стоимость");
                passengerCar = new PassengerCar();
                carPark.add(passengerCar);
                increaseTheNumberOfCars();
            }
            case "2" -> {
                System.out.println("Введите марку вашего грузового автомобиля и его стоимость");
                truck = new Truck();
                carPark.add(truck);
                increaseTheNumberOfCars();
            }
            case "3" -> {
                System.out.println("Введите марку вашего автобуса и его стоимость");
                bus = new Bus();
                carPark.add(bus);
                increaseTheNumberOfCars();
            }
            case "4" -> {
                System.out.println("Введите марку вашей техники и ее стоимость");
                specializedEquipment = new SpecializedEquipment();
                carPark.add(specializedEquipment);
                increaseTheNumberOfCars();
            }
            default -> System.out.println("Некорректный ввод");
        }
    }

    private void provisionOfInformation() {
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

    private void increaseTheNumberOfCars() {
        numberOfCars++;
        System.out.println("В нашем автопарке " + numberOfCars + " автомобиля(-ей)");
    }

    private void removeTheCar(String carBrand) {
        boolean foundACar = false;
        for (int i = 0; i < carPark.size(); i++) {
            if (carBrand.equals(carPark.get(i).getBrand())) {
                System.out.println("Поздравляем! Вы купили " + carBrand);
                carPark.remove(i);
                numberOfCars--;
                foundACar = true;
            }
        }
        if (!foundACar) {
            System.out.println("У нас нет данной марки авто.");
        }
        System.out.println("В нашем автопарке " + numberOfCars + " автомобиля(-ей)");
    }
}
