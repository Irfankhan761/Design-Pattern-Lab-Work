package Mediator_Pattern_Example;
import java.util.Date;

/**
 *
 * @author Irfan Kha
 */
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}