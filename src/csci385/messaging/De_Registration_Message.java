package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class De_Registration_Message implements Message{
    //int Message_identifier;
    int size;
    byte ID[];
    De_Registration_Message(int message_identifier,int Size){
        //Message_identifier = message_identifier;
        size = Size;
    }
    De_Registration_Message(byte[] id ) throws IOException {
            ID = id;
        ByteArrayInputStream in  = new ByteArrayInputStream(ID);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        String s  = new String(ID);

    }
    public byte [] Message() throws IOException{

        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Oout = new DataOutputStream(out);
        Oout.writeInt(size);
        Oout.flush();
        return out.toByteArray();





    }
}
