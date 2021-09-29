package csci385.messaging;

import java.io.*;

public class Registration_Response  implements Message{
    int Message_Identifier;
    boolean success;
    int msgSize;
    byte[] message;

    Registration_Response(int message,boolean bool,int size){
        Message_Identifier = message;
        success = bool;
        msgSize = size;
    }

    Registration_Response() throws IOException {
        Registration_Response Reg = new Registration_Response();

        ByteArrayOutputStream out  = new ByteArrayOutputStream();

        DataOutputStream Out = new DataOutputStream(out);



        Out.writeInt(msgSize);
        Out.flush();
        byte[]  ByteArray1  = new byte[registration_Response];




    }
    public void message() throws IOException{

      ByteArrayInputStream in  = new ByteArrayInputStream(message);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        message = new byte[registration_Response];


    }

}
