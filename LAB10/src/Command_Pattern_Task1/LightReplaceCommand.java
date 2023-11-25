package Command_Pattern_Task1;

/**
 *
 * @author Irfan Khan
 */
//Concrete Command
public class LightReplaceCommand implements Command {

    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Replacing the light...");
        light.switchOff();
        replaceLight();
        light.switchOn();
        System.out.println("Light is replaced and on");
    }

    private void replaceLight() {
        System.out.println("Light is replaced");
    }
}

