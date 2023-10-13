package Iterator_Pattern;

/**
 *
 * @author Irfan Khan
 */
public interface StudentIterator extends Iterator {
    void printAll();

    void printStudentWithNameStartingFrom(String name);
}