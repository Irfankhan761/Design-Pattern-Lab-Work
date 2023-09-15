package Inheritance;

public class Test {

    public static void main(String[] args) {

        Ferrari myFerrari = new Ferrari();
        System.out.println("Name: " + myFerrari.name);
        System.out.println("Speed: " + myFerrari.speed);
        System.out.println("Color: " + myFerrari.color);
        System.out.println("Release Year: " + myFerrari.carRelease);
        myFerrari.forwardSpeed();
        myFerrari.reverseSpeed();
    }
}
