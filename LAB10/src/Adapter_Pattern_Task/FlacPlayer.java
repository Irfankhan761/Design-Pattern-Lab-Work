package Adapter_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class FlacPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing flac file. Name: " + fileName);
   }
}
