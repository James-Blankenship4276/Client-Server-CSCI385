package csci385.messaging;

import java.io.*;


public class Registration_Message implements Message {
int size;
int Message_identifier;
byte Byte[];
    public Registration_Message(int Size,int Message){
    size = Size;
    Message_identifier = Message;
    }
    public Registration_Message() throws IOException {
    Registration_Message Reg = new Registration_Message();
        ByteArrayInputStream in = new ByteArrayInputStream(Byte);
        ObjectInputStream inputStream = new ObjectInputStream(in);
        inputStream.read();
       Byte = new byte[registration_Response];


    }


    public void message() throws IOException  {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        ObjectOutputStream Oout = new ObjectOutputStream(out);
        Oout.writeInt(size);
        Oout.flush();
        Byte = new byte[REGISTRATION_MESSAGE];
    }
}
