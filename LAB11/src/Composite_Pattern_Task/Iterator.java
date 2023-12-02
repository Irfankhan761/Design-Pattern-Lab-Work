package Composite_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public interface Iterator {
    boolean hasNext();
    IEmployee next();
    Object[] nextWithLevel();
    boolean hasNextWithLevel();
}