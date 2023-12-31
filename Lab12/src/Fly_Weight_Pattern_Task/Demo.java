package Fly_Weight_Pattern_Task;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Irfan Khan
 */

public class Demo {
    static Random random;
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Context context = new Context(MiddlePlanting.getInstance(), CANVAS_SIZE);
        random = new Random();
        for (int i = 0; i < Math.floor((double) TREES_TO_DRAW / TREE_TYPES); i++) {
            if (random.nextBoolean()) {
                context.plant(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Mangoe Tree", Color.GREEN, "Produced Fruits");
            }else {
                context.plant(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Tree 1", Color.ORANGE, "produce rarai");
                context.plant(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Tree 2", Color.ORANGE, "Have only Leaves");
            }
        }
        context.setForestUI();
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES);
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return random.nextInt(min, max + 1);
    }
}