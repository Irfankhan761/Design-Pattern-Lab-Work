
package ObserverPatternExample2;
/**
 *
 * @author Irfan Khan
 */
public class Demo {

	public static void main(String[] args) {
		WhiteShirt shirt = new WhiteShirt();
		
		Person irfan = new Person("Irfan");
		Person nawaz = new Person ("Nawaz");
		Person usama = new Person ("Usama");
		
		shirt.subscribe(irfan);
		shirt.subscribe(usama);
		
		shirt.setInStock(true);
		shirt.setInStock(false);
		
		shirt.unscubscribe(irfan);
		shirt.setInStock(true);
		

	}

}