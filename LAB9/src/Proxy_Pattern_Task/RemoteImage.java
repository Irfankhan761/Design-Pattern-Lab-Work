package Proxy_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class RemoteImage implements Image{
    @Override
    public void display(String actualSource) {
        System.out.println("Loaing image from actual source "+actualSource);
    }
}