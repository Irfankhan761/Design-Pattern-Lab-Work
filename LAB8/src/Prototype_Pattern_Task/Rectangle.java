package Prototype_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}