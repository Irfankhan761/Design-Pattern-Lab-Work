package finalLab;

/**
 *
 * @author Irfan Khan
 */
// Facade for easy interface
class CommunicationFacade {
    private IMediator mediator;

    public CommunicationFacade() {
        this.mediator = new CommunicationMediator();
    }

    public void sendMessage(Stakeholder sender, Stakeholder receiver, String message) {
        mediator.sendMessage(sender, receiver, message);
    }
}
