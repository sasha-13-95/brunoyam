package Module10.Middle2;

import Module10.Middle2.Employees.Cleaner;
import Module10.Middle2.Employees.Employee;
import Module10.Middle2.Employees.Hr;
import Module10.Middle2.Employees.Manager;

import java.util.Scanner;

import static Module10.Middle2.Accounting.salaryCalculation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свою должность, количество отработанных дней и kpi (в %)");
        String jobTitle = scanner.nextLine();
        int numberOfWorkingDays = scanner.nextInt();
        int kpi = scanner.nextInt();
        Employee employee = null;
        switch (jobTitle) {
            case "уборщик" -> employee = new Cleaner(jobTitle, numberOfWorkingDays, kpi);
            case "менеджер" -> employee = new Manager(jobTitle, numberOfWorkingDays, kpi);
            case "hr" -> employee = new Hr(jobTitle, numberOfWorkingDays, kpi);
            default -> System.out.println("Некорректное значение");
        }
        salaryCalculation(employee);
    }
}
