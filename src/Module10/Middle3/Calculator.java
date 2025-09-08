package Module10.Middle3;

import Module10.Middle3.Cars.Car;

import static Module10.Middle3.Cars.Car.*;

public class Calculator {
    public static double calculationOfTheAmount(Car car, double time) {
        double sum = ((MAX_MILEAGE - car.getMileage()) * (MAX_AGE - car.ageCalculation()) * car.getCoefficient() * time) / 1000;
        return sum;
    }
}
