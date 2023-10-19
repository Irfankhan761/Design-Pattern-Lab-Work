package Decorator_Pattern_FileDecorator;

/**
 *
 * @author Irfan Khan
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
