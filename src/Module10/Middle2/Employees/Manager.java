package Module10.Middle2.Employees;


public class Manager extends Employee {
    private final static int SALARY = 4000; // чистый оклад (в день)
    private final static int BONUS = 20000;

    public Manager(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(SALARY, BONUS);
    }
}
