package Command_Pattern_Task1;
/**
 *
 * @author Irfan Khan
 */
//Receiver
public class Light {

    private boolean isOn;

    public void switchOn() {
        System.out.println("Turning on the light");
        isOn = true;
    }

    public void switchOff() {
        System.out.println("Turning off the light");
        isOn = false;
    }
}

