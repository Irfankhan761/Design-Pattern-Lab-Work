package ObserverPatternExample1Task1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//To convert the anonymous concrete observer to a proper concrete observer class, you can follow these steps:
//Create a new class that implements the Observer interface.
//Override the update method in the new class to define how it should respond to updates.
//Instantiate the new observer class and add it to the EventSource.
interface Observer {

    void update(String event);
}

class ConcreteObserver implements Observer {

    @Override
    public void update(String event) {
        System.out.println("Received response: " + event);
    }
}

class EventSource {

    List<Observer> observers = new ArrayList<>();

    public void notifyObservers(String event) {
        observers.forEach(observer -> observer.update(event));
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notifyObservers(line);
        }
    }
}

public class ObserverDemo {

    public static void main(String[] args) {
        System.out.println("Enter Text : ");
        EventSource eventSource = new EventSource();

        Observer concreteObserver = new ConcreteObserver(); // Create a concrete observer
        eventSource.addObserver(concreteObserver); // Add the observer to the event source

        eventSource.scanSystemIn();
    }
}
