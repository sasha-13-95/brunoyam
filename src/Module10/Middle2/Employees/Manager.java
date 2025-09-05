package Module10.Middle2.Employees;


public class Manager extends Employee {
    private int salary = 4000; // чистый оклад (в день)
    private int bonus = 20000;

    public Manager(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(salary, bonus);
    }
}
