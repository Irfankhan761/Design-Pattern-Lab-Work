package Command_Pattern_Task2;

/**
 *
 * @author Irfan Khan
 */
import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void push(Command c) {
        history.push(c);
        redoStack.clear(); // Clear redo stack on new command
    }

    public Command pop() {
        Command command = history.pop();
        if (command != null) {
            redoStack.push(command);
        }
        return command;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    public void redo() {
        if (canRedo()) {
            Command command = redoStack.pop();
            if (command != null) {
                command.execute();
                history.push(command);
            }
        }
    }
}
