package midlab;

/**
 *
 * @author TECHNIFI 1
 */
public class ObsMatch1 extends ObserverMatch {

    public ObsMatch1(Match subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Cs vs EEE match Start Here");
    }

}
