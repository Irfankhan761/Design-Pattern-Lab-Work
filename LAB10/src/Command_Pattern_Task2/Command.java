package Command_Pattern_Task2;

/**
 *
 * @author Irfan Khan
 */
public abstract class Command {

    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();

    public boolean canUndo() {
        return true;
    }

    public boolean canRedo() {
        return false;
    }
}
