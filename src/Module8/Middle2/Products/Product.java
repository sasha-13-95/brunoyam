package Module8.Middle2.Products;


public abstract class Product {
    private int volume;
    private String name;

    protected Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}

