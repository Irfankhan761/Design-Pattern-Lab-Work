package ObserverPatternExample3;

/**
 *
 * @author Irfan Khan
 */
public class Demo {

	public static void main(String[] args) {
		Commentary commentary = new Commentary();
		Subscriber subscriber = new SMSSubscriber("Irfan Khan [Swabi]");
		commentary.subsrcibe(subscriber);

		Subscriber subscriber2 = new SMSSubscriber("Nawaz Khan [Buner]");
		commentary.subsrcibe(subscriber2);

		commentary.setDesc("Welcome to live Soccer match");
		commentary.setDesc("Current score 0-0");
		commentary.unSubsrcibe(subscriber2);

		
		commentary.setDesc("It’s a goal!!");
		commentary.setDesc("Current score 1-0");

		Subscriber subscriber3 = new SMSSubscriber("Ahmad Hussain [Jadoon]");
		commentary.subsrcibe(subscriber3);
		commentary.setDesc("It’s another goal!!");
		commentary.setDesc("Half-time score 2-0");


	}

}