package employee;

public abstract class Employee{
    private final String name;
    private final double salary;
    protected final double bonus; 
    protected Employee(String name, double salary) {
        this.name =name;
        this.salary= salary;
        this.bonus =calculateBonus(); //compute once
    }

    protected double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    protected abstract double calculateBonus();
    public double getBonus() {
        return bonus;
    }
}
