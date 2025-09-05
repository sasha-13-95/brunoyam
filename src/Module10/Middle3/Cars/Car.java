package Module10.Middle3.Cars;

import java.time.LocalDate;

public abstract class Car implements CarInterface {
    private int year;
    public static final int MAX_AGE = 20;
    private double mileage;
    public static final int MAX_MILEAGE = 10000;
    private int coefficient;

    public Car(int year, double mileage) {
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public int ageCalculation(int year) {
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
