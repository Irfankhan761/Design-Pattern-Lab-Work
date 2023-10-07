package AbstractionConcept;

/**
 *
 * @author Irfan Khan
 */
public class Test {

    public static void main(String[] args) {
        Vehicle CarObj = new Car();
        CarObj.label();
        CarObj.wheels();
        CarObj.speed();

        Vehicle BikeObj = new Bike();
        BikeObj.label();
        BikeObj.wheels();
        BikeObj.speed();
    }

}
