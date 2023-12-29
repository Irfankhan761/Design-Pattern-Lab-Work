package finalLab;

/**
 *
 * @author Irfan khan
 */
class MessageCommunication extends CommunicationTemplate {
    @Override
    protected void prepareCommunication(Stakeholder sender, Stakeholder receiver) {
        System.out.println("Preparing Message communication between " + sender.getName() + " and " + receiver.getName());
    }

    @Override
    protected void sendMessage(String content) {
        System.out.println("Sending Message message: " + content);
    }

    @Override
    protected void handleFeedback() {
        System.out.println("Handling Message feedback");
    }
}
