package finalLab;

/**
 *
 * @author Irfan khan
 */
abstract class CommunicationTemplate {
    public final void communicate(Stakeholder sender, Stakeholder receiver, String content) {
        prepareCommunication(sender, receiver);
        sendMessage(content);
        handleFeedback();
    }

    protected abstract void prepareCommunication(Stakeholder sender, Stakeholder receiver);

    protected abstract void sendMessage(String content);

    protected abstract void handleFeedback();
}


