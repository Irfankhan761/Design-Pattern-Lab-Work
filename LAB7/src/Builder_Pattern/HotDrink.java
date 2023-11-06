package Builder_Pattern;

/**
 *
 * @author Irfan Khan
 */
public abstract class HotDrink implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}