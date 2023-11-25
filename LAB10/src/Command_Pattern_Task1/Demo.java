package Command_Pattern_Task1;
/**
 *
 * @author Irfan khan
 */
public class Demo {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command replaceLight = new LightReplaceCommand(light);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();

        // replace light
        control.setCommand(replaceLight);
        control.pressButton();
    }
}
