package AbstractionConcept;

public class Car extends Vehicle {

    @Override
    void wheels() {
        System.out.println("Car have 4 wheels ");
    }

    @Override
    void speed() {
        System.out.println("Speed of Car is 120km/hrs ");
    }

}
