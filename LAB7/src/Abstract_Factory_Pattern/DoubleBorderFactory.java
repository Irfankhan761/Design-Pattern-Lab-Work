/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Factory_Pattern;

/**
 *
 * @author TECHNIFI 1
 */
public class DoubleBorderFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubledRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new DoubledSquare();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new DoubledTriangle();
        }
        return null;
    }
}