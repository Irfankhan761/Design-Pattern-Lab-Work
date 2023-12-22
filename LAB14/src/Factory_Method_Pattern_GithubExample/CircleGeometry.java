package Factory_Method_Pattern_GithubExample;

/**
 *
 * @author Irfan Khan
 */
public class CircleGeometry extends Geometery{

    @Override
    public Shape createShape() {
        return new Circle();
    }

}
