package Module8.Hard1;


import java.util.Scanner;
import static Module8.Hard1.Dealership.*;

public class SpecializedEquipment extends  Car {

    private Scanner scan = new Scanner(System.in);
    private String specializedEquipmentBrand1;
    private String specializedEquipmentBrand2;
    int price;
    @Override
    public void addCar() {
        System.out.println("Введите марку вашей техники");
        specializedEquipmentBrand1 = scan.nextLine();
        System.out.println("Введите стоимость вашей техники");
        price = scan.nextInt();
        numberOfCars++;
        System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
    }

    @Override
    public void removeTheCar() {
        boolean foundACar = false;
        System.out.println("Какую марку специализированной технинки вы хотите купить?");
        specializedEquipmentBrand2 = scan.next();
        for (int i = 0; i < carPark.size(); i++) {
            if (specializedEquipmentBrand2.equals(carPark.get(i).getBrand())) {
                System.out.println("Поздравляем! Вы купили специализированную технику " + specializedEquipmentBrand2);
                carPark.remove(i);
                numberOfCars--;
                foundACar = true;
            }
            if (!foundACar) {
                System.out.println("У нас нет техники данной марки.");
            }
            System.out.println("В нашем автопарке " + numberOfCars + " автомобилей");
        }

    }
    public String getBrand() {
        return specializedEquipmentBrand1;
    }
    public int getPrice() {
        return price;
    }
}
