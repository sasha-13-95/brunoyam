package Module10.Middle3.Cars;

public class Porsche extends Car {
    private final static int COEFFICIENT = 8;

    public Porsche(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
