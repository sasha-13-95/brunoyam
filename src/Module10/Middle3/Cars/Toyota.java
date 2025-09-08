package Module10.Middle3.Cars;

public class Toyota extends Car {
    private static final int COEFFICIENT = 4;

    public Toyota(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
