
package midlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irfan Khan
 */
public class Match {


    private List<ObserverMatch> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyActiveObservers();
    }

    public void attach(ObserverMatch observer) {
        observers.add(observer);
    }

    public void detach(ObserverMatch observer) {
        observers.remove(observer);
    }

    private void notifyActiveObservers() {
        for (ObserverMatch observer : observers) {
            if (observer.isActive()) {
                observer.update();
            }
        }
    }
}
  

