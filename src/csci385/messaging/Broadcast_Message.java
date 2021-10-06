package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class Broadcast_Message implements Message{
    int Message_Identifier;
    int SenderIdSize;
    byte[] Sender_ID;
    int messageSize;
    byte[] Message;

    Broadcast_Message(int Indentifer,int idsize , int msgsize){
        Message_Identifier = Indentifer;
        SenderIdSize = idsize;
        messageSize = msgsize;


    }
    Broadcast_Message(byte [] ID,byte[] message) throws IOException {
        Sender_ID = ID;
        Message = message;
        ByteArrayInputStream in  = new ByteArrayInputStream(Sender_ID);
        ByteArrayInputStream inM = new ByteArrayInputStream(Message);
        DataInputStream Datain = new DataInputStream(in);
        DataInputStream DatainMessage = new DataInputStream(inM);
        in.read();
        inM.read();
        String StringID = new String(Sender_ID);

        String sMessage  = new String(Message);


    }
    public byte[] message() throws  IOException{
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(Sender_ID);
        Out.write(Message);
        Out.flush();
        return out.toByteArray();







    }

}
