package PolymorphismConcept;

/**
 *
 * @author Irfan Khan
 */
public class Test {

    public static void main(String[] args) {
        F16 myF16 = new F16();
        myF16.fly();
        myF16.fly(10000);
        myF16.fly("F16", 10000);
    }
}
