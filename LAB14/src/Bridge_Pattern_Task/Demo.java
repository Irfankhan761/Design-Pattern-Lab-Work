package Bridge_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new Ac());  //  new AC device
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with universal remote.");
        UniversalRemote universalRemote = new UniversalRemote(device);
        universalRemote.maxVolume();
        device.printStatus();
    }
}
