package AbstractionConcept;

/**
 *
 * @author Irfan Khan
 */
public class Bike extends Vehicle {

    @Override
    void wheels() {
        System.out.println("Bike have 2 Wheels");
    }

    @Override
    void speed() {
        System.out.println("Speed of Bike is 70km/hr");
    }

}
