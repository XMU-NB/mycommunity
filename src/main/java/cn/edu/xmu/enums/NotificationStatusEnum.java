package cn.edu.xmu.enums;

/**
 * @author NieBin
 * @create 2020-06-05 20:35
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
