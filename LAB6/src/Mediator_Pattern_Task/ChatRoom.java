package Mediator_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
import java.util.Date;

public class ChatRoom {

    public static void showMessage(AbstractUser user, String message, AbstractUser... receivers) {
        String recieverNames = "";
        for (AbstractUser receiver : receivers) {
            recieverNames += receiver.name() + ", ";
        }
        
        System.out.println(new Date() + " [" + user.name() +"-> <"+recieverNames+ "> ] : " + message);
    }
}