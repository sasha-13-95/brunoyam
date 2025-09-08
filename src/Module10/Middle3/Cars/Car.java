package Module10.Middle3.Cars;

import java.time.LocalDate;

public abstract class Car implements CarInterface {
    public static final int MAX_AGE = 20;
    public static final int MAX_MILEAGE = 10000;
    private int coefficient;
    private int year;
    private double mileage;

    public Car(int year, double mileage) {
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public int ageCalculation() {
        LocalDate localDate = LocalDate.now();
        int age = localDate.getYear() - year;
        return age;
    }

    public int getYear() {
        return year;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public double getMileage() {
        return mileage;
    }
}
