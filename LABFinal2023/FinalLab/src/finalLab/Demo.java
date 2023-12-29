package finalLab;

/**
 *
 * @author Irfan Khan
 */
import java.util.ArrayList;
import java.util.List;



public class Demo
{
    public static void main(String[] args) {
        // Singleton Pattern
        ISettings settings = Settings.getInstance();
        System.out.println("Notification Message: " + settings.getNotificationMessage());

        // Mediator Pattern to control coupling
        CommunicationFacade facade = new CommunicationFacade();
        List<Stakeholder> stakeholders = new ArrayList<>();
        Stakeholder sender = new Stakeholder("Sender");
        Stakeholder receiver = new Stakeholder("Receiver");
        stakeholders.add(sender);
        stakeholders.add(receiver);

        // Facade Pattern for easy interface
        facade.sendMessage(sender, receiver, "Hello, how are you?");

        // Strategy Pattern to adopt for different ways of communication
        ICommunicationStrategy notifyStrategy = new NotificationStrategy();
        notifyStrategy.communicate("Important Notification content");

        ICommunicationStrategy smsStrategy = new SMSCommunicationStrategy();
        smsStrategy.communicate("Urgent SMS content");

        // Builder Pattern for Communicating Object
        ICommunicationBuilder<Message> messageBuilder = new MessageBuilder();
        messageBuilder.buildContent("Builder pattern message");
        Message message = messageBuilder.getResult();
        System.out.println("Built Message: " + message.getContent());

        // Iterator for any Stakeholder/Contents iteration
        IIterator<Stakeholder> iterator = new StakeholderIterator(stakeholders);
        while (iterator.hasNext()) {
            Stakeholder currentStakeholder = iterator.next();
            System.out.println("Iterating stakeholders: " + currentStakeholder.getName());
        }

        // Template Pattern 
        CommunicationTemplate communicationTemplate = new MessageCommunication();
        communicationTemplate.communicate(sender, receiver, "Template method content");

        // Observer for real-time communication
        AnnouncementObserver announcementObserver = new AnnouncementObserver();
        announcementObserver.update("New announcement!");

        // Observer pattern
        sender.update("This is a direct message to the stakeholder.");
    }
}

