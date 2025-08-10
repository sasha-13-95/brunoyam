package Module8.Hard1;


import java.util.Scanner;

import static Module8.Hard1.Dealership.*;

public class Bus extends Car {
    private Scanner scan = new Scanner(System.in);
    private String busBrand1;
    private String busBrand2;
    private int price;

    @Override
    public void addCar() {
        System.out.println("Введите марку вашего автобуса");
        busBrand1 = scan.nextLine();
        System.out.println("Введите стоимость вашего автобуса");
        price = scan.nextInt();
        numberOfCars++;
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
    }

    @Override
    public void removeTheCar() {
        boolean foundACar = false;
        System.out.println("Какую марку автобуса вы хотите купить?");
        busBrand2 = scan.next();
        for (int i = 0; i < carPark.size(); i++) {
            if (busBrand2.equals(carPark.get(i).getBrand())) {
                System.out.println("Поздравляем! Вы купили автобус " + busBrand2);
                carPark.remove(i);
                numberOfCars--;
                foundACar = true;
            }
        }
        if (!foundACar) {
            System.out.println("У нас нет автобуса данной марки.");
        }
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
    }


    public String getBrand() {
        return busBrand1;
    }

    public int getPrice() {
        return price;
    }
}
