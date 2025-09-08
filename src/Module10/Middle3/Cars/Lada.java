package Module10.Middle3.Cars;

public class Lada extends Car {
    private static final int COEFFICIENT = 1;

    public Lada(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
