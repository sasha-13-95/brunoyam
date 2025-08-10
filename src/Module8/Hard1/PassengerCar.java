package Module8.Hard1;


import java.util.Scanner;
import static Module8.Hard1.Dealership.*;

public class PassengerCar extends Car {
    private Scanner scan = new Scanner(System.in);
    private String passengerCarBrand1;
    private String passengerCarBrand2;

    int price;

    @Override
    public void addCar() {
        System.out.println("Введите марку вашего легкового автомобиля");
        passengerCarBrand1 = scan.nextLine();
        System.out.println("Введите стоимость вашего легкового автомобиля");
        price = scan.nextInt();
        numberOfCars++;
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");

    }

    @Override
    public void removeTheCar() {
        boolean foundACar = false;
        System.out.println("Какую марку легкового автомобиля вы хотите купить?");
        passengerCarBrand2 = scan.next();
        for (int i = 0; i < carPark.size(); i++) {
            if (passengerCarBrand2.equals(carPark.get(i).getBrand())) {
                System.out.println("Поздравляем! Вы купили легковой автомобиль " + carPark.get(i).getBrand());
                carPark.remove(i);
                numberOfCars--;
                foundACar = true;
            }
        }
            if (!foundACar) {
                System.out.println("У нас нет автомобиля данной марки.");
            }
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
    }


    public String getBrand() {
        return passengerCarBrand1;
    }
    public int getPrice() {
        return price;
    }
}
