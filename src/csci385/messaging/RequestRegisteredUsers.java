package csci385.messaging;

import java.io.*;

public class RequestRegisteredUsers implements Message{


    int MessageIdentifier;

    boolean success;

    int msgSize;

    byte[] message;

    RequestRegisteredUsers() throws IOException {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(message);
        Out.flush();
        message  = new byte[request_Registered_users];
    }
    void message() throws IOException{
        ByteArrayInputStream in  = new ByteArrayInputStream(message);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        message = new byte[request_Registered_users];
    }
}
