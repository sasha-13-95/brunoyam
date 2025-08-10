package Module8.Middle2;


public class Milk extends Product {
    private static final int MILK_VOLUME = 30;
    private String productName = "молоко";

    public int getProductVolume() {
        return MILK_VOLUME;
    }

    public String getProductName() {
        return productName;
    }
}
