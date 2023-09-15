package EncapsulationConcepts;

public class Test {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();

        myVehicle.setName("Ferrari");
        myVehicle.setPrice(1.5);
        myVehicle.setNumberOfSeats(4);
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Price is: " + myVehicle.getPrice() + "$");
        System.out.println("Number of Seats: " + myVehicle.getNumberOfSeats());

    }

}
