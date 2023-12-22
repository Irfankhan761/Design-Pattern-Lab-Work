package Factory_Method_Pattern_Example;

/**
 *
 * @author Irfan Khan
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
