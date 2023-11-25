package Command_Pattern_Task1;

/**
 *
 * @author Irfan Khan
 */
//Concrete Command

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }

}
