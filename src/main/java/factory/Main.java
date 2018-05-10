package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// designPatterns factory
public class Main {

    // Main method
    public static void main(String[] args) throws IOException {
        MessageFactory msgFactory = new MessageFactory();

        // Setup new user input reader
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in));

        // Get message type
        System.out.println("MESSAGE FACTORY\n[Notification] --notify\n[Warning] --warning");
        System.out.println("\nEnter Message Type: ");
        String msgType = lineReader.readLine();

        System.out.println("Enter Message: ");
        String msgString = lineReader.readLine();

        Message newMsg = msgFactory.getMessage(msgType, msgString);

        newMsg.printMessage();

    }
}
