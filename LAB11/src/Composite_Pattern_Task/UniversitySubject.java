package Composite_Pattern_Task;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Irfan Khan
 */

public class UniversitySubject implements IUniversitySubject {
    private final List<IEmployeeObserver> observers;

    public UniversitySubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(IEmployeeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IEmployeeObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String change) {
        for (IEmployeeObserver observer : observers) {
            observer.update(change);
        }
    }

    @Override
    public void notifyObservers(String change, String... type) {
        for (IEmployeeObserver observer : observers) {
            for (String t : type) {
                if (observer.getClass().getSimpleName().equalsIgnoreCase(t)) {
                    observer.update(change);
                }
            }
        }

    }
}