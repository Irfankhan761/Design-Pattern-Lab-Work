package ChainOfResponsibility_Task;

/**
 *
 * @author Irfan Khan
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger :: " + message);
    }
}
