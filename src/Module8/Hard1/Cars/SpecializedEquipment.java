package Module8.Hard1.Cars;


import java.util.Scanner;

public class SpecializedEquipment extends Car {

    private Scanner scan = new Scanner(System.in);

    private String specializedEquipmentBrand;

    private int price;

    public SpecializedEquipment() {
        specializedEquipmentBrand = scan.nextLine();
        price = scan.nextInt();
    }

    public String getBrand() {
        return specializedEquipmentBrand;
    }

    public int getPrice() {
        return price;
    }
}
