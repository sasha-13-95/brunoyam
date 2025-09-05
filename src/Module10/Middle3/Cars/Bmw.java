package Module10.Middle3.Cars;

public class Bmw extends Car {
    private int coefficient = 7;

    public Bmw(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
