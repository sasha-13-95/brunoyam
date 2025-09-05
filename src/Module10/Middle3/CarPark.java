package Module10.Middle3;

import Module10.Middle3.Cars.*;

import java.util.Scanner;

import static Module10.Middle3.Calculator.calculationOfTheAmount;

public class CarPark {
    private Scanner scanner = new Scanner(System.in);
    private int maxNumberOfCars = 10;
    private Car[] cars;
    private Car car;

    public CarPark() {
        System.out.println("Добро пожаловать в наш автопарк! У нас в наличии 10 авто");
        cars = new Car[maxNumberOfCars];
        cars[0] = new Bmw(2025, 8500);
        cars[1] = new Bugatti(2024, 5000);
        cars[2] = new Jaguar(2023, 4000);
        cars[3] = new Lada(2022, 10000);
        cars[4] = new Li(2021, 800);
        cars[5] = new Porsche(2020, 50);
        cars[6] = new Renault(2019, 6700);
        cars[7] = new Toyota(2018, 9500);
        cars[8] = new Volga(2017, 9800);
        cars[9] = new Volkswagen(2016, 400);
    }

    public void carParkIsWorking() {
        System.out.println("Какое авто вы хотите (марка)?");
        car = carSelection(scanner.nextLine());
        if (car == null) {
            System.out.println("Такой машины в прокате нет");
        } else {
            System.out.println("Не позднее какого года выпуска должно быть авто?");
            int year = scanner.nextInt();
            System.out.println("Какой максимальный пробег?");
            double mileage = scanner.nextDouble();
            System.out.println("На какое время вы хотите арендовать авто?");
            double time = scanner.nextDouble();
            double result = calculationOfTheAmount(car, year, mileage, time);
            if (result == 0) {
                System.out.println("Авто с такими характеристиками в прокате нет");
            } else {
                System.out.println("Стоимость аренды авто на 1 час = " + result);
            }
        }
    }

    public Car carSelection(String carBrand) {
        car = null;
        switch (carBrand) {
            case "Bmw" -> car = cars[0];
            case "Bugatti" -> car = cars[1];
            case "Jaguar" -> car = cars[2];
            case "Lada" -> car = cars[3];
            case "Li" -> car = cars[4];
            case "Porsche" -> car = cars[5];
            case "Renault" -> car = cars[6];
            case "Toyota" -> car = cars[7];
            case "Volga" -> car = cars[8];
            case "Volkswagen" -> car = cars[9];
            default -> System.out.println("Вы указали неверное значение");
        }
        return car;
    }
}
