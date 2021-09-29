package csci385.messaging;

import java.io.*;

public class Broadcast_Message implements Message{
    int Message_Identifier;
    int SenderIdSize;
    byte[] Sender_ID;
    int messageSize;
    byte[] Message;

    Broadcast_Message() throws IOException {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        DataOutputStream Out = new DataOutputStream(out);
        Out.write(Sender_ID);
        Out.write(Message);
        Out.flush();
        Sender_ID = new byte[broadcast_Message];
        Message = new byte[broadcast_Message];

    }
    public void message(){
        ByteArrayInputStream in  = new ByteArrayInputStream(Sender_ID);
        ByteArrayInputStream inM = new ByteArrayInputStream(Message);
        DataInputStream Datain = new DataInputStream(in);
        DataInputStream DatainMessage = new DataInputStream(inM);
        in.read();
        inM.read();
        Sender_ID = new byte[broadcast_Message];
        Message = new byte[broadcast_Message];




    }

}
