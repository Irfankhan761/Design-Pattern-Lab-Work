package midlab;

/**
 *
 * @author Irfan Khan
 */
public abstract class ObserverMatch {

    protected Match subject;
    protected boolean active = true;

    public abstract void update();

    public  boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

