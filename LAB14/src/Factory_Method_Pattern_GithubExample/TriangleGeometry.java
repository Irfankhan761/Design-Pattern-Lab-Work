package Factory_Method_Pattern_GithubExample;

/**
 *
 * @author Irfan Khan
 */
public class TriangleGeometry extends  Geometery{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
