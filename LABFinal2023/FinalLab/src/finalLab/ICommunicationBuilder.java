package finalLab;

/**
 *
 * @author Irfan khan
 */
interface ICommunicationBuilder<T> {
    void buildContent(String content);

    T getResult();
}

