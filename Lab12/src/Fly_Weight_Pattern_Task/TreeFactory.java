package Fly_Weight_Pattern_Task;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Irfan Khan
 */
public class TreeFactory {

    static Map<String, IMyTreeType> treeTypes = new HashMap<>();

    public static IMyTreeType getTreeType(String name, Color color, String otherTreeData) {
        IMyTreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
        }
        treeTypes.put(name, result);
        return result;
    }
}
