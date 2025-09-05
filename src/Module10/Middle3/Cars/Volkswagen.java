package Module10.Middle3.Cars;

public class Volkswagen extends Car {
    private int coefficient = 5;

    public Volkswagen(int year, double mileage) {
        super(year, mileage);
        setCoefficient(coefficient);
    }
}
