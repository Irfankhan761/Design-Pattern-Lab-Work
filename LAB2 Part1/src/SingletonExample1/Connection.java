package SingletonExample1;

/**
 *
 * @author Irfan Khan
 */
public class Connection {

    private static Connection instance;

    private Connection() {

    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    public void getData() {
        System.out.println("This is the data retrive from the DB");
    }

}
