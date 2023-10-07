package InterfacesConcept;

/**
 *
 * @author Irfan Khan
 */
public class Ferrari implements Vehicle, Car {

    @Override
    public void Wheels() {
        System.out.println("Ferrari Have 4 Wheels");
    }

    @Override
    public void speed() {
        System.out.println("Ferrari Speed is 200km/hr");
    }

    @Override
    public void price() {
        System.out.println("Price of ferrari is 1M$");
    }

}
