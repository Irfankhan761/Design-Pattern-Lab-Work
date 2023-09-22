package AbstractionConcept;

abstract class Vehicle {
// abstract methods

    abstract void wheels();

    abstract void speed();
// concrete method

    void label() {
        System.out.println("Vehicle's data:");
    }
}
