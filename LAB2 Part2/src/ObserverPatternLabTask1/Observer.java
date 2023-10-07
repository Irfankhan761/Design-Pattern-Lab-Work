package ObserverPatternLabTask1;

/**
 *
 * @author Irfan Khan
 */
public abstract class Observer {

    protected Subject subject;
    protected boolean active = true;

    public abstract void update();

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
