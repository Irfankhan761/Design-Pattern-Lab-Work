package Bridge_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */

public class AC implements Device {

    private boolean on = false;
    private int temperature = 25;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature > 30) {
            this.temperature = 30;
        } else if (temperature < 16) {
            this.temperature = 16;
        } else {
            this.temperature = temperature;
        }
    }

    @Override
    public int getVolume() {
        return 0;  // AC doesn't have volume
    }

    @Override
    public void setVolume(int percent) {
        // AC doesn't have volume
    }

    @Override
    public int getChannel() {
        return 0;  // AC doesn't have channels
    }

    @Override
    public void setChannel(int channel) {
        // AC doesn't have channels
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm AC.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current temperature is " + temperature + "°C");
        System.out.println("------------------------------------\n");
    }
}
