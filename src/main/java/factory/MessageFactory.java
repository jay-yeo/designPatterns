package factory;

public class MessageFactory {

    public Message getMessage(String msgType, String msgString) {
        if (msgType == null) {
            return null;
        }

        if (msgType.equalsIgnoreCase("--notify")) {
            return new Notification(msgString);
        } else if (msgType.equalsIgnoreCase("--warning")) {
            return new Warning(msgString);
        }

        return null;
    }
}
