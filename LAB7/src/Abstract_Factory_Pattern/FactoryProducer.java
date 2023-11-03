/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Factory_Pattern;

/**
 *
 * @author TECHNIFI 1
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int type) {
        if (type == TYPES.ROUNDED) {
            return new RoundedShapeFactory();
        } else if (type == TYPES.DOUBLED) {
            return new DoubleBorderFactory();
        } else if (type == TYPES.NORMAL) {
            return new ShapeFactory();
        } else {
            return null;
        }

    }
}
