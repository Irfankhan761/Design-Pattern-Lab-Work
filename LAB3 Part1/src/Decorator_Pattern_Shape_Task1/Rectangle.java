
package Decorator_Pattern_Shape_Task1;

public class Rectangle implements  Shape{
    int rectanglePrice= 200;
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
        System.out.println("Price: " + rectanglePrice);
    }
@Override
public int getPrice(){
        return rectanglePrice;
    }
}
