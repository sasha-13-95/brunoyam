package Module10.Middle3.Cars;

public class Volga extends Car {
    private int coefficient = 2;

    public Volga(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
