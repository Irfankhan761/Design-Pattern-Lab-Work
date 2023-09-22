
//      4.Prove that multiple inheritance is not supported in Java?
class Parent1 {
    void showMessage() {
        System.out.println("Message from Parent1");
    }
}
class Parent2 {
    void showMessage() {
        System.out.println("Message from Parent2");
    }
}
// This will result in a compilation error because Java does not allow
// a class to inherit from multiple classes.
//class Child extends Parent1, Parent2{
class Child extends Parent1{
   
}
public class Q4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage(); // This would be ambiguous if it were allowed.
    }
}

