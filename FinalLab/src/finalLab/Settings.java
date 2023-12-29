package finalLab;

/**
 *
 * @author Irfan khan
 */
class Settings implements ISettings {
    private static Settings instance;
    private String notificationMessage;

    private Settings() {
        // private constructor to enforce Singleton pattern
        notificationMessage = "Default Notification Message";
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    @Override
    public String getNotificationMessage() {
        return notificationMessage;
    }

    // Other settings-related methods
}
