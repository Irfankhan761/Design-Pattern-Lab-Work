package Abstract_Factory_Pattern;

/**
 *
 * @author Irfan khan
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