package Builder_Pattern;

/**
 *
 * @author Irfan Khan
 */
public class DietPepsi extends ColdDrink {

    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {
        return "Diet Pepsi";
    }
}
