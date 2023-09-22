package InterfacesConcept;

class Test {

    public static void main(String[] args) {
        Ferrari myFerrari = new Ferrari();

        myFerrari.Wheels();
        myFerrari.speed();
        myFerrari.price();
        System.out.println("Number of seats: " + Car.numberOfseats);
        System.out.println("Color of ferrari is : " + Car.color);
    }
}
