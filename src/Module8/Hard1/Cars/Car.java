package Module8.Hard1.Cars;


import java.util.Scanner;

public abstract class Car {
    private Scanner scan = new Scanner(System.in);
    private String brand;
    private int price;

    protected Car() {
        brand = scan.nextLine();
        price = scan.nextInt();
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
