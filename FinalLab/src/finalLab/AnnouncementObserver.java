package finalLab;

/**
 *
 * @author Irfan Khan
 */
class AnnouncementObserver implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Announcement: " + message);
    }
}
