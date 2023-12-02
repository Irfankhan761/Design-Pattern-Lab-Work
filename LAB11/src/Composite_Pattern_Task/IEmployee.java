package Composite_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
import java.util.List;

public interface IEmployee extends IEmployeeObserver {
    void giveBonus(int percent);
    void addSubordinate(IEmployee subordinate);
    List<IEmployee> getSubordinatesList();
    String getName();
    int getSalary();
    Iterator getIterator();

}
