package Module10.Middle2.Employees;

public class Hr extends Employee {
    private int salary = 2000; // чистый оклад (в день)
    private int bonus = 10000;

    public Hr(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(salary, bonus);
    }
}
