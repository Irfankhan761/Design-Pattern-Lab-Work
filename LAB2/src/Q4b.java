//Multiple inheritance through interface ony possible in java
interface Parent1 {

    void showMessage1();
}

interface Parent2 {

    void showMessage2();
}

class Child implements Parent1, Parent2 {

    @Override
    public void showMessage1() {
        System.out.println("Message from Parent1");
    }

    @Override
    public void showMessage2() {
        System.out.println("Message from Parent2");
    }
}

public class Q4b {

    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage1();
        child.showMessage2();
    }
}
