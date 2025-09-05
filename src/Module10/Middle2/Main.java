package Module10.Middle2;

import java.util.Scanner;

import static Module10.Middle2.Accounting.salaryCalculation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свою должность, количество отработанных дней и kpi (в %)");
        salaryCalculation(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
    }
}
