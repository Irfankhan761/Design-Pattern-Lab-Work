package finalLab;

/**
 *
 * @author Irfan khan
 */
class NotificationStrategy implements ICommunicationStrategy {
    @Override
    public void communicate(String content) {
        System.out.println("Sending Notification: " + content);
    }
}