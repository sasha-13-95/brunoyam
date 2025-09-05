package Module10.Middle2;


import Module10.Middle2.Employees.Cleaner;
import Module10.Middle2.Employees.Employee;
import Module10.Middle2.Employees.Hr;
import Module10.Middle2.Employees.Manager;

public class Accounting {
    public static void salaryCalculation(String jobTitle, int numberOfWorkingDays, int kpi) {
        Employee employee = null;
        int salary = 0;
        switch (jobTitle) {
            case "уборщик" -> {
                employee = new Cleaner(jobTitle, numberOfWorkingDays, kpi);
            }
            case "менеджер" -> {
                employee = new Manager(jobTitle, numberOfWorkingDays, kpi);
            }
            case "hr" -> {
                employee = new Hr(jobTitle, numberOfWorkingDays, kpi);
            }
            default -> {
                System.out.println("Некорректное значение");
                return;
            }
        }
        if (employee.getKpi() < 100) {
            salary = employee.getSalary() * employee.showNumberOfDaysWorked();
        }
        if (employee.getKpi() >= 100) {
            salary = employee.getSalary() * employee.showNumberOfDaysWorked() + employee.getBonus();
        }
        System.out.println("Заработная плата за " + employee.showNumberOfDaysWorked() + " дней = " + salary + " (должность " + employee.showPosition() + ").");
    }
}