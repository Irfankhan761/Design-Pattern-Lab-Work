package Composite_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */

public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(this);
    }
    public abstract void giveBonus(int percent);

    @Override
    public abstract void update(String change);
}