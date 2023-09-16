
//      5.How to override the static method?
class A {

    public static void show() {
        System.out.println("Hello from Parent");
    }
}

class B extends A {

    public static void show() {
        System.out.println("Hello from Child");
    }
}

public class Q5 {

    public static void main(String[] args) {
        A obA =new A();
        obA.show();
        B obB = new  B();
        obB.show();
    }
}
