package Module10.Middle2.Employees;

public abstract class Employee implements EmployeeInterface {
    private String jobTitle;
    private int numberOfWorkingDays;
    private int kpi;
    private int salary;
    private int bonus;

    public Employee(String jobTitle, int numberOfWorkingDays, int kpi) {
        this.jobTitle = jobTitle;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.kpi = kpi;
    }

    @Override
    public String showPosition() {
        return jobTitle;
    }

    @Override
    public int showNumberOfDaysWorked() {
        return numberOfWorkingDays;
    }

    public void setSalaryAndBonus(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public int getKpi() {
        return kpi;
    }

    public int getBonus() {
        return bonus;
    }
}
