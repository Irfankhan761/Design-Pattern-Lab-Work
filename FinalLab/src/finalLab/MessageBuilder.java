package finalLab;

/**
 *
 * @author Irfan khan
 */
class MessageBuilder implements ICommunicationBuilder<Message> {
    private Message message;

    public MessageBuilder() {
        this.message = new Message();
    }

    @Override
    public void buildContent(String content) {
        message.setContent(content);
    }

    @Override
    public Message getResult() {
        return message;
    }
}
