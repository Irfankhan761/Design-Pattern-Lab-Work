package Abstract_Factory_Pattern;

/**
 *
 * @author Irfan Khan
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
