package Fly_Weight_Pattern_Task;
import java.awt.*;

/**
 *
 * @author Irfan Khan
 */


public class SouthPlanting implements Planting {
    private static SouthPlanting instance;
    Forest forest;
    private int sizeFactor = 3;
    private SouthPlanting() {
        forest = Forest.getInstance();
    }

    public static SouthPlanting getInstance() {
        if (instance == null) {
            instance = new SouthPlanting();
        }
        return instance;
    }

    @Override
    public void plant(int xPos, int yPos, String name, Color color, String otherData) {
        forest.plantTree(xPos, yPos,sizeFactor, name, color, otherData);
    }
}
