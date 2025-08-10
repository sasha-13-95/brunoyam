package Module8.Middle2;


public class Bread extends Product {
    private static final int VOLUME_OF_BREAD = 20;
    private String productName = "хлеб";

    public int getProductVolume() {
        return VOLUME_OF_BREAD;
    }

    public String getProductName() {
        return productName;
    }
}
