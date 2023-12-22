package Factory_Method_Pattern_GithubExample;

/**
 *
 * @author Irfan Khan
 */
public class SquareGeometry extends Geometery {

    @Override
    public Shape createShape() {
        return new Square();
    }

}
