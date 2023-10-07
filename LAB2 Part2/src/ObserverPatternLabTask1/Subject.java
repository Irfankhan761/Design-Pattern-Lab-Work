package ObserverPatternLabTask1;

/**
 *
 * @author Irfan Khan
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyActiveObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyActiveObservers() {
        for (Observer observer : observers) {
            if (observer.isActive()) {
                observer.update();
            }
        }
    }
}
