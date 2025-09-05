package Module10.Middle3.Cars;

public class Porsche extends Car {
    private int coefficient = 8;

    public Porsche(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
