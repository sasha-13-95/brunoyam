package Module10.Middle3.Cars;

public class Jaguar extends Car {
    private final static int COEFFICIENT = 9;

    public Jaguar(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
