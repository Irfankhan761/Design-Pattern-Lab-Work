package Decorator_Pattern_Shape_Task1;

/**
 *
 * @author Irfan Khan
 */
public class Circle implements Shape {

    int circlePrice = 100;

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
        System.out.println("Price: " + circlePrice);
    }

    @Override
    public int getPrice() {
        return circlePrice;
    }
}
