package csci385.messaging;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {//https://www.youtube.com/watch?v=-xKgxqG411c
    public Server() throws IOException {
        ServerSocket ss = new ServerSocket(0);
        Socket s = ss.accept();
        InputStreamReader in  = new InputStreamReader(s.getInputStream());
        //PrintWriter out =  new PrintWriter(s.getOutputStream(),true);
        BufferedReader inRead = new BufferedReader(in);
        PrintWriter printWriter = new PrintWriter(s.getOutputStream());
        Registration_Message registration_message = new Registration_Message(30,3);
        registration_message.message();
        Registration_Response registration_response = new Registration_Response(4,30);

        ByteArrayOutputStream out  =  new ByteArrayOutputStream();
        registration_response = new Registration_Response(out.toByteArray());
        registration_response.message();

    }
}
