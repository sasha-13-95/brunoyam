package Module8.Middle2;


public class Sausage extends Product {
    private static final int VOLUME_OF_SAUSAGE = 30;

    private String productName = "колбаса";

    public int getProductVolume() {
        return VOLUME_OF_SAUSAGE;
    }

    public String getProductName() {
        return productName;
    }
}
