package employee;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    protected double calculateBonus() {
        return getSalary() * 0.10; //10% bonus
    }
}
