
//    1. Overloading of the main method is possible or not?
public class Q1 {

    public static void main(String[] args) {
        System.out.println("This is the original main method.");

        // Call the overloaded main method.
        main(10, 20);
    }

    public static void main(int a, int b) {
        System.out.println("This is the overloaded main method.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
