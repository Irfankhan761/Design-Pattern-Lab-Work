package State_Pattern_Example;

/**
 *
 * @author Irfan Khan
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}