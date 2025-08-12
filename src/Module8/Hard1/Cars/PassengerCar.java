package Module8.Hard1.Cars;


import java.util.Scanner;

public class PassengerCar extends Car {
    private Scanner scan = new Scanner(System.in);
    private String passengerCarBrand;

    private int price;

    public PassengerCar() {
        passengerCarBrand = scan.nextLine();
        price = scan.nextInt();
    }

    public String getBrand() {
        return passengerCarBrand;
    }

    public int getPrice() {
        return price;
    }
}
