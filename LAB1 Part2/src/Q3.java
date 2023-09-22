
//3.	What are the six ways to use this keyword?
class MyClass {

    private int value;

    // 1. Accessing Instance Variables
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    // 2. Invoking Constructors (Constructor Chaining)
    public MyClass() {
        this(0); // Calling another constructor with an argument
    }

    public MyClass(int value) {
        this.value = value;
    }

    // 3. Returning the Current Instance
    public MyClass modifyValue(int newValue) {
        this.value = newValue;
        return this;
    }

    // 4. Passing "this" as an Argument
    public void printObjectInfo() {
        System.out.println("Object Info: " + this);
    }

    // 5. Returning "this" from a Method
    public MyClass getObject() {
        return this;
    }

    // 6. Referring to Inner Class Instances
    public class InnerClass {

        public void printOuterValue() {
            System.out.println("Outer Value from Inner Class: " + MyClass.this.value);
        }
    }
}

public class Q3 {

    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj1 = new MyClass();

        // 1. Accessing Instance Variables
        obj1.setValue(42);
        System.out.println("Value: " + obj1.getValue());

        // 2. Invoking Constructors (Constructor Chaining)
        MyClass obj2 = new MyClass(10);
        System.out.println("Value: " + obj2.getValue());

        // 3. Returning the Current Instance
        obj1.modifyValue(100).modifyValue(200);
        System.out.println("Modified Value: " + obj1.getValue());

        // 4. Passing "this" as an Argument
        obj1.printObjectInfo();

        // 5. Returning "this" from a Method
        MyClass obj3 = obj1.getObject();
        System.out.println("Are obj1 and obj3 the same object? " + (obj1 == obj3));

        // 6. Referring to Inner Class Instances
        MyClass.InnerClass inner = obj1.new InnerClass();
        inner.printOuterValue();
    }
}
