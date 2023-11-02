
package midlab;

/**
 *
 * @author TECHNIFI 1
 */
public class ObsMatch2 extends ObserverMatch {

    public ObsMatch2(Match subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Mansehra  vs Abbottabad match Start Here");
    }

}