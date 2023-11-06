package Builder_Pattern;

/**
 *
 * @author Irfan Khan
 */
public class DietCoke extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}