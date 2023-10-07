package PolymorphismConcept;

/**
 *
 * @author Irfan Khan
 */
class F16 {

    public void fly() {
        System.out.println("The F16 is flying.");
    }

    public void fly(int height) {
        System.out.println("The F16 is flying " + height + " feet high.");
    }

    public void fly(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " feet high.");
    }
}
