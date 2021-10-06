package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;

public class Registration_Message implements Message {
int size;
int Message_identifier;
byte ID[];
    public Registration_Message(int Size,int Message){
    size = Size;
    Message_identifier = Message;
    }
    public Registration_Message(byte[] Message) throws IOException {
   ID = Message;
        ByteArrayInputStream in = new ByteArrayInputStream(ID);
       DataInputStream inputStream = new DataInputStream(in);
        inputStream.read();
      String s = new String(ID);


    }


    public byte[] message() throws IOException  {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Oout = new DataOutputStream(out);
        Oout.writeInt(size);
        Oout.flush();
        return out.toByteArray();

    }
}
