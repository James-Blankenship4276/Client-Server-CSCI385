package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class RequestRegisteredUsers implements Message{


    int MessageIdentifier;

    boolean success;

    int msgSize;

    byte[] message;
    RequestRegisteredUsers(int identifier,int size){
        MessageIdentifier = identifier;
        msgSize = size;



    }

    RequestRegisteredUsers() throws IOException {
        ByteArrayInputStream in  = new ByteArrayInputStream(message);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        String s = new String(message);


    }
    public byte[] message() throws IOException{
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(message);
        Out.flush();
        return out.toByteArray();

    }
}
