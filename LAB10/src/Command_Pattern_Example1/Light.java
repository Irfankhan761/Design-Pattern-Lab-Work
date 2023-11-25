package Command_Pattern_Example1;

/**
 *
 * @author Irfan Khan
 */
//Receiver

public class Light {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

}
