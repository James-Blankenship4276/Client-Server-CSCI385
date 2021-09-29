package csci385.messaging;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Whisper_Message {
    int Message_Identifier;
    int recipientIdSize;
    byte[] recipient_ID;
    int SenderIdSize;
    byte[] SenderId;
    int messageSize;
    byte[] Message;
    Whisper_Message()throws IOException {
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
