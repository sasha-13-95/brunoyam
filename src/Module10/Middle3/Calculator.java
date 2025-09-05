package Module10.Middle3;

import Module10.Middle3.Cars.Car;

import static Module10.Middle3.Cars.Car.*;

public class Calculator {
    public static double calculationOfTheAmount(Car car, int year, double mileage, double time) {
        double sum = 0;
        if (year <= car.getYear() && mileage >= car.getMileage()) {
            int age = car.ageCalculation(year);
            sum = ((MAX_MILEAGE - mileage) * (MAX_AGE - age) * car.getCoefficient() * time) / 1000;
        }
        return sum;
    }
}
