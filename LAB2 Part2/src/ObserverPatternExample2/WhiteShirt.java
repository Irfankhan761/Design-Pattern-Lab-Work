package ObserverPatternExample2;

/**
 *
 * @author Irfan Khan
 */
import java.util.ArrayList;

public class WhiteShirt implements Publisher {

    private ArrayList<Subscriber> subscribers;
    boolean inStock = false;

    public WhiteShirt() {
        subscribers = new ArrayList<Subscriber>();
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifySubscribers();
        }
    }

    public void subscribe(Subscriber s) {
        if (!subscribers.contains(s)) {
            subscribers.add(s);
        }
    }

    public void unscubscribe(Subscriber s) {
        if (subscribers.contains(s)) {
            subscribers.remove(s);
        }
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update();
        }
    }

}
