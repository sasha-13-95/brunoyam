package Module10.Middle3.Cars;

public class Bugatti extends Car {
    private int coefficient = 10;

    public Bugatti(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
