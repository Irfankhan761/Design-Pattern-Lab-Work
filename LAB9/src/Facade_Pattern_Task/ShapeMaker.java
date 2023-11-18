package Facade_Pattern_Task;

/**
 * 
 * @author Irfan Khan
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle; // Adding a new shape

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle(); // Instantiate the new shape
    }

    public void drawCircle(String... arguments) {
        circle.draw(arguments);
    }

    public void drawRectangle(String... arguments) {
        rectangle.draw(arguments);
    }

    public void drawSquare(String... arguments) {
        square.draw(arguments);
    }

//    For new shape triangle drawTriangle method is used here
    public void drawTriangle(String... arguments) {
        triangle.draw(arguments);
    }
}
