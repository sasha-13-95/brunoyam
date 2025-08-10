package Module8.Middle2;


public class Cucumber extends Product {
    private static final int CUCUMBER_VOLUME = 10;
    private String productName = "огурец";

    public int getProductVolume() {
        return CUCUMBER_VOLUME;
    }

    public String getProductName() {
        return productName;
    }
}
