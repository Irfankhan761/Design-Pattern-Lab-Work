package Factory_Method_Pattern_Example;

/**
 *
 * @author Irfan Khan
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
