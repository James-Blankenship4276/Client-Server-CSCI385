package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class Registration_Response  implements Message{
    int Message_Identifier;
    boolean success;
    int msgSize;
    byte[] message;

    Registration_Response(int messageid,int size){
        Message_Identifier = messageid;

        msgSize = size;
    }

    Registration_Response(byte[] ByteArray) throws IOException {
        message = ByteArray;

        ByteArrayInputStream in  = new ByteArrayInputStream(message);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        String s = new String(message);





    }
    public byte[]  message() throws IOException{

        ByteArrayOutputStream out  = new ByteArrayOutputStream();

        DataOutputStream Out = new DataOutputStream(out);



        Out.writeInt(msgSize);
        Out.flush();
        return out.toByteArray();




    }

}
