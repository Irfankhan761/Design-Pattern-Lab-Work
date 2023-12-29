package finalLab;

/**
 *
 * @author Irfan khan
 */
class SMSCommunicationStrategy implements ICommunicationStrategy {
    @Override
    public void communicate(String content) {
        System.out.println("Sending SMS: " + content);
    }
}