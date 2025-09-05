package Module10.Middle3.Cars;

public class Renault extends Car {
    private int coefficient = 3;

    public Renault(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
