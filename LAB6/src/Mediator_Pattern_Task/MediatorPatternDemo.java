package Mediator_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        AbstractUser mAliUser = new User("M Ali");
        AbstractUser comsatsUniversity = new University("COMSATS University");
        AbstractUser nustUniversity = new University("NUST University");
        AbstractUser aliTeacher = new Teacher("Sir Ali");
        AbstractUser ahmadUser = new User("Ahmad");
        AbstractUser zainUser = new User("Zain");
        
        mAliUser.sendMessage("Ali Says Hi to COMSATS University", comsatsUniversity);

        mAliUser.sendMessage("Ali Says Hi to many at the same time", comsatsUniversity,nustUniversity,aliTeacher,ahmadUser,zainUser);
        
        comsatsUniversity.sendMessage("Your Exam is Started From 30th October", mAliUser);

    }
}