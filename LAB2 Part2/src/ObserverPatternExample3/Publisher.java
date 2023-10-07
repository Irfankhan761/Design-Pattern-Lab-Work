
package ObserverPatternExample3;
/**
 *
 * @author Irfan Khan
 */
public interface Publisher {
	void subsrcibe(Subscriber s);
	void unSubsrcibe(Subscriber s);
	void notifySubscribers();
}