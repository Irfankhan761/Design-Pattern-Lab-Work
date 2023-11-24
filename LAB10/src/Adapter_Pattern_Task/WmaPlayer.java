package Adapter_Pattern_Task;

/**
 *
 * @author TECHNIFI 1
 */
public class WmaPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing wma file. Name: " + fileName);
   }
}
