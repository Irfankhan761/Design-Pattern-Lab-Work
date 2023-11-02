package midlab;

/**
 *
 * @author Irfan Khan
 */
public class Demo {

    public static void main(String[] args) {
        Match match = new Match();
        ObsMatch1 match1 = new ObsMatch1(match);
        ObsMatch2 match2 = new ObsMatch2(match);
        
        System.out.println("Match Schedules");
        match.setState(1);
        
        match.attach(match1);
         
        match.detach(match1);
        match1.isActive();
        System.out.println("Match: 2");
        match.attach(match2);
        match.setState(2);
        match.detach(match2);


    }

}
