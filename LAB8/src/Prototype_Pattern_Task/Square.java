package Prototype_Pattern_Task;

/**
 *
 * @author Irfan khan
 */
public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
