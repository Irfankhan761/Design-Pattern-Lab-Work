package Abstract_Factory_Pattern;

/**
 *
 * @author Irfan Khan
 */
public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}