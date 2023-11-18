package Facade_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class Square implements Shape {

    @Override
    public void draw(String... arguments) {
        StringBuilder stringBuilder = new StringBuilder("Square::draw(");
        for (String arg : arguments) {
            stringBuilder.append(arg).append(", ");
        }
        if (arguments.length > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()); // Remove the trailing comma and space
        }
        stringBuilder.append(")");
        System.out.println(stringBuilder.toString());
    }
}
