package Bridge_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */


public class UniversalRemote extends BasicRemote {

    public UniversalRemote(Device device) {
        super(device);
    }

    public void maxVolume() {
        System.out.println("Remote: set max volume");
        device.setVolume(device.getVolume() + 100);
    }
}

