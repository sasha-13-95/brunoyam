package Module10.Middle2.Employees;


public class Cleaner extends Employee {
    private final static int SALARY = 1000; // чистый оклад (в день)
    private final static int BONUS = 5000;

    public Cleaner(String jobTitle, int numberOfWorkingDays, int kpi) {
        super(jobTitle, numberOfWorkingDays, kpi);
        setSalaryAndBonus(SALARY, BONUS);
    }
}
