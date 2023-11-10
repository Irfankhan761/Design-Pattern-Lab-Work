package Prototype_Pattern_Example;

/**
 *
 * @author Irfan Khan
 */
public class Circle extends Shape {

   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}