package Command_Pattern_Example1;

/**
 *
 * @author Irfan Khan
 */
//Invoker

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
