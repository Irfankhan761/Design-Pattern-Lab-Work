package finalLab;

/**
 *
 * @author Irfan khan
 */
class CommunicationMediator implements IMediator {
    @Override
    public void sendMessage(Stakeholder sender, Stakeholder receiver, String message) {
        
        receiver.receiveMessage(message);
    }
}