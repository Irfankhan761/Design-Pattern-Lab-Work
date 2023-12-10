package State_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */

public interface Iterator<T> {
    T getCurrent();
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
    void reset();
}
