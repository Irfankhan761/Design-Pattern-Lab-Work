package State_Pattern_Task;



/**
 *
 * @author TECHNIFI 1
 */
public class LockedState extends State {

    LockedState(Player player) {
        super(player);
        UI.changeLabelState("Locked");
    }

    @Override
    public String onLock() {
        player.changeState(new ReadyState(player));
        player.setLocked(false);
        player.setPlaying(false);
        player.getIterator().reset();
        return "Ready";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setPlaying(false);
        player.setLocked(false);
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
