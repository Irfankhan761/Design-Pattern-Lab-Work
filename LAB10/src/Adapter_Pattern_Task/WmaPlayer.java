package Adapter_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class WmaPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing wma file. Name: " + fileName);
   }
}
