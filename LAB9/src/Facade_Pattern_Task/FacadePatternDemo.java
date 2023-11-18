package Facade_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle("red", "border");
        shapeMaker.drawRectangle("blue", "filled");
        shapeMaker.drawSquare("green", "dotted");
        //Additional Triangle shapes are also used.
        shapeMaker.drawTriangle("yellow", "transparent");
    }
}
