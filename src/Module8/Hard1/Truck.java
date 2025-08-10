package Module8.Hard1;


import java.util.Scanner;
import static Module8.Hard1.Dealership.*;

public class Truck extends  Car {
    private Scanner scan = new Scanner(System.in);
    private String truckBrand1;
    private String truckBrand2;
    int price;
    @Override
    public void addCar() {
        System.out.println("Введите марку вашего грузового автомобиля");
        truckBrand1 = scan.nextLine();
        System.out.println("Введите стоимость вашего грузового автомобиля");
        price = scan.nextInt();
        numberOfCars++;
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");

    }

    @Override
    public void removeTheCar() {
        boolean foundACar = false;
        System.out.println("Какую марку грузового автомобиля вы хотите купить?");
        truckBrand2 = scan.next();
        for (int i = 0; i < carPark.size(); i++) {
            if (truckBrand2.equals(carPark.get(i).getBrand())) {
                System.out.println("Поздравляем! Вы купили грузовой автомобиль " + truckBrand2);
                carPark.remove(i);
                numberOfCars--;
                foundACar = true;
            } if (!foundACar){
                System.out.println("У нас нет грузового автомобиля данной марки.");
            }
            System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
        }
    }
    public String getBrand() {
        return truckBrand1;
    }

    public int getPrice() {
        return price;
    }

}
