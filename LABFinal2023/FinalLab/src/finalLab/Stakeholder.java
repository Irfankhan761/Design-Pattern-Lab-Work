package finalLab;

/**
 *
 * @author Irfan khan
 */
class Stakeholder implements IObserver {
    private String name;

    public Stakeholder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }

    @Override
    public void update(String message) {
        receiveMessage(message);
    }
}

