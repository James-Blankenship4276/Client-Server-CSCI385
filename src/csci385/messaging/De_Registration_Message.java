package csci385.messaging;

import java.io.*;

public class De_Registration_Message implements Message{
    int Message_identifier;
    int size;
    byte id[];
    De_Registration_Message(int message_identifier,int Size){
        Message_identifier = message_identifier;
        size = Size;
    }
    De_Registration_Message() throws IOException {
        De_Registration_Message De_Registration  = new De_Registration_Message();
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        ObjectOutputStream Oout = new ObjectOutputStream(out);
        Oout.writeInt(size);
        Oout.flush();
        id   = new byte[de_Registration_Message];
    }
    public void Message() throws IOException{


        ByteArrayInputStream in  = new ByteArrayInputStream(id);
        DataInputStream InputStream = new DataInputStream(in);
        InputStream.read();
        id = new byte[de_Registration_Message];



    }
}
