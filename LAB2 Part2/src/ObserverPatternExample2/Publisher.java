
package ObserverPatternExample2;
/**
 *
 * @author Irfan Khan
 */
public interface Publisher {
	void subscribe(Subscriber s);
	void unscubscribe(Subscriber s);

}