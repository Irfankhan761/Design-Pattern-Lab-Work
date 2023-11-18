package Proxy_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class ProtectedImage implements Image {
    @Override
    public void display(String imageType) {
        System.out.println("Displaying image for correct user of Type "+imageType);
    }
}