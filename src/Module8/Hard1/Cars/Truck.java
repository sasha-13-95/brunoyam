package Module8.Hard1.Cars;

import java.util.Scanner;

public class Truck extends Car {
    private Scanner scan = new Scanner(System.in);

    private String truckBrand;

    private int price;

    public Truck() {
        truckBrand = scan.nextLine();
        price = scan.nextInt();
    }

    public String getBrand() {
        return truckBrand;
    }

    public int getPrice() {
        return price;
    }
}
