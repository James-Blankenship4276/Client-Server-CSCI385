package csci385.messaging;

import java.io.*;
import java.net.Socket;

public class Client {
    public void Client_Start() throws IOException {//https://www.youtube.com/watch?v=-xKgxqG411c

        Socket s = new Socket("Host",0);
        PrintWriter printWriter = new PrintWriter(s.getOutputStream());
        InputStreamReader in  = new InputStreamReader(s.getInputStream());
        BufferedReader inRead = new BufferedReader(in);



    }
}
