package Command_Pattern_Task2;

/**
 *
 * @author Irfan Khan
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) {
            return false; // No text selected, disable the command
        }

        editor.clipboard = editor.textField.getSelectedText();
        return true;
    }
}