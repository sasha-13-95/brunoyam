package Module10.Middle2.Employees;


public class Cleaner extends Employee {
    private int salary = 1000; // чистый оклад (в день)
    private int bonus = 5000;

    public Cleaner(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(salary, bonus);
    }
}
