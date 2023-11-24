package Adapter_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing vlc file. Name: " + fileName);
   }
}
