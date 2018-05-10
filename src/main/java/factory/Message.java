package factory;

public abstract class Message {

    public String message;

    // Print message
    public void printMessage() {
        System.out.println(this.getClass().getName().toUpperCase());
        System.out.println("Message: ");
        System.out.println(this.message);
    }
}
