
package Task;

/**
 *
 * @author Irfan Khan
 */
public class Demo {

	public static void main(String[] args) {
		SingletonExample2.Configuration config = SingletonExample2.Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));

	}
}