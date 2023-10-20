package Mediator_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public interface AbstractUser {
    String name();
    void sendMessage(String message, AbstractUser... users);
    
}
