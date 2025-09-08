package Module10.Middle2;

import Module10.Middle2.Employees.Employee;

public class Accounting {
    public final static int REQUIRED_KPI = 100;

    public static void salaryCalculation(Employee employee) {
        int salary = 0;
        if (employee.getKpi() < REQUIRED_KPI) {
            salary = employee.getSalary() * employee.showNumberOfDaysWorked();
        }
        if (employee.getKpi() >= REQUIRED_KPI) {
            salary = employee.getSalary() * employee.showNumberOfDaysWorked() + employee.getBonus();
        }
        System.out.println("Заработная плата за " + employee.showNumberOfDaysWorked() + " дней = " + salary + " (должность " + employee.showPosition() + ").");
    }
}