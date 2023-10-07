package EncapsulationConcepts;

/**
 *
 * @author Irfan Khan
 */
public class Vehicle {

    private String name;
    private double price;
    private int numberOfSeats;

// Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
// Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

    }
}
