package State_Pattern_Task;

/**
 *
 * @author TECHNIFI 1
 */
public class StopState extends State {

    public StopState(Player player) {
        super(player);
        UI.changeLabelState("Stopped");
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setLocked(true);
        return "Locked...";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setLocked(false);
        return "Ready...";
    }

    @Override
    public String onNext() {
        return "Stopped...";
    }

    @Override
    public String onPrevious() {
        return "Stopped...";
    }
}
