package Module8.Hard1.Cars;


import java.util.Scanner;

public class Bus extends Car {
    private Scanner scan = new Scanner(System.in);
    private String busBrand;
    private int price;

    public Bus() {
        busBrand = scan.nextLine();
        price = scan.nextInt();
    }

    public String getBrand() {
        return busBrand;
    }

    public int getPrice() {
        return price;
    }
}
