package Module10.Middle3.Cars;

public class Li extends Car {
    private final static int COEFFICIENT = 6;

    public Li(int year, double mileage) {
        super(year, mileage);
        setCoefficient(COEFFICIENT);
    }
}
