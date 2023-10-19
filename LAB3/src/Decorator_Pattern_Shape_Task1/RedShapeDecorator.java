package Decorator_Pattern_Shape_Task1;

/**
 *
 * @author Irfan Khan
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        System.out.println("Total Price: " + (getPrice() + decoratedShape.getPrice()));
    }

    @Override
    public int getPrice() {
        return 500;
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
