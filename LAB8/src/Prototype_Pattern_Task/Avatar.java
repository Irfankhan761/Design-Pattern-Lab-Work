package Prototype_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
public class Avatar implements Cloneable {

    private String avatarType;

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public boolean equals(Avatar otherAvatar) {
        return this.avatarType.equals(otherAvatar.avatarType);
    }
}