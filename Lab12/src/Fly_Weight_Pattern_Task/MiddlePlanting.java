package Fly_Weight_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
import java.awt.*;

public class MiddlePlanting implements Planting {
    private static MiddlePlanting instance;
    private Forest forest;
    private int sizeFactor = 2;

    private MiddlePlanting() {
        forest = Forest.getInstance();
    }

    public static MiddlePlanting getInstance() {
        if (instance == null) {
            instance = new MiddlePlanting();
        }
        return instance;
    }


    @Override
    public void plant(int xPos, int yPos, String name, Color color, String otherData) {
        forest.plantTree(xPos, yPos,sizeFactor, name, color, otherData);
    }
}
