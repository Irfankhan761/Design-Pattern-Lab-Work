package Iterator_Pattern;

/**
 *
 * @author Irfan Khan
 */
public interface Iterator {

    public boolean hasNext();

    public Object next();

    boolean hasPrevious();

    public Object previous();

    public Object moveTofirst();

    Object moveTolast();
}
