package Module10.Middle3.Cars;

public class Volga extends Car {
    private static final int COEFFICIENT = 2;

    public Volga(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
