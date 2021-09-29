package csci385.messaging;

import java.io.*;

public class Response_Registered_Users  implements Message {
    int Message_Identifier;
    int numberOfUsers;
    int idSize;
    byte[] id;

    Response_Registered_Users() throws IOException {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(id);
        Out.flush();
        id = new byte[response_Registered_Users];
    }
    public void message() throws  IOException{
        ByteArrayInputStream in  = new ByteArrayInputStream(id);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        id = new byte[de_Registration_Message];



    }
}
