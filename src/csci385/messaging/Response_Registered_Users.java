package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class Response_Registered_Users  implements Message {
    int Message_Identifier;
    int numberOfUsers;
    int idSize;
    byte[] id;

    Response_Registered_Users() throws IOException {

        ByteArrayInputStream in  = new ByteArrayInputStream(id);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
      String s = new String(id);
    }
    public byte[] message() throws  IOException{
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(id);
        Out.flush();
        return out.toByteArray();




    }
}
