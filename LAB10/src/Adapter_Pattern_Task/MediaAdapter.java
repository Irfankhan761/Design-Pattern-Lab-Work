package Adapter_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class MediaAdapter implements MediaPlayer {
   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      } else if (audioType.equalsIgnoreCase("wma")){
         advancedMusicPlayer = new WmaPlayer();
      } else if (audioType.equalsIgnoreCase("flac")){
         advancedMusicPlayer = new FlacPlayer();
      }
   }

   @Override
   public void play(String audioType, String fileName) {
      advancedMusicPlayer.play(fileName);
   }
}

