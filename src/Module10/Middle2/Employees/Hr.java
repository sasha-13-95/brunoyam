package Module10.Middle2.Employees;

public class Hr extends Employee {
    private final static int SALARY = 2000; // чистый оклад (в день)
    private final static int BONUS = 10000;

    public Hr(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(SALARY, BONUS);
    }
}
