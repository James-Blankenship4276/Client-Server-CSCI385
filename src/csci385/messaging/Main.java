package csci385.messaging;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Client client = new Client();
       Server server = new Server();
       client.Client_Start();

    }
}
