package Command_Pattern_Task2;

/**
 *
 * @author Irfan Khan
 */
public class RedoCommand extends Command {

    public RedoCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (canRedo()) {
            editor.history.redo();
            return true;
        }
        return false;
    }

    @Override
    public boolean canRedo() {
        return editor.history.canRedo();
    }
}
