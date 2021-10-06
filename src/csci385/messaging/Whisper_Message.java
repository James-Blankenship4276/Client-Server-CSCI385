package csci385.messaging;

import java.io.*;
import java.io.ByteArrayOutputStream;
public class Whisper_Message implements  Message{
    int Message_Identifier;
    int recipientIdSize;
    byte[] recipient_ID;
    int SenderIdSize;
    byte[] SenderId;
    int messageSize;
    byte[] Message;
    Whisper_Message(int Indentifer,int recipient,int sender,int msgsize){
        Message_Identifier = Indentifer;
        recipientIdSize = recipient;
        SenderIdSize = sender;
        messageSize = msgsize;




    }
    Whisper_Message()throws IOException {//https://www.tutorialspoint.com/How-to-convert-an-object-to-byte-array-in-java

        ByteArrayInputStream in  = new ByteArrayInputStream(recipient_ID);
        ByteArrayInputStream inS  = new ByteArrayInputStream(SenderId);

        ByteArrayInputStream inM = new ByteArrayInputStream(Message);
        DataInputStream Datain = new DataInputStream(in);
        DataInputStream DatainMessage = new DataInputStream(inM);
        in.read();
        inM.read();
        inS.read();

        SenderId.toString();
        recipient_ID.toString();
        Message.toString();





    }
    public void Message()throws IOException{
        ByteArrayOutputStream OutRecIDbyte = new ByteArrayOutputStream();
        ByteArrayOutputStream OutSendbyte = new ByteArrayOutputStream();
        ByteArrayOutputStream OutMessagebyte = new ByteArrayOutputStream();
        DataOutputStream Outdata = new DataOutputStream(OutRecIDbyte);

        Outdata.write(recipient_ID);
        Outdata.write(SenderId);
        Outdata.write(Message);
        Outdata.flush();




    }
}
