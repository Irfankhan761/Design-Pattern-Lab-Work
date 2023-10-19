package Decorator_Pattern_Shape_Example1;

/**
 *
 * @author Irfan Khan
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle =new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        
        System.out.println("Circle with normal border");
        circle.draw();
        
        System.out.println("\ncircle of red border");
        redCircle.draw();
        
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
