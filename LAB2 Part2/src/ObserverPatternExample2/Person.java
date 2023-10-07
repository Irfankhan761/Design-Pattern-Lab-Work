
package ObserverPatternExample2;
/**
 *
 * @author Irfan Khan
 */
public class Person implements Subscriber{
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hello "+name+", product is now in stock");
		
	}

}