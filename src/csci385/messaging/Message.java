
package csci385.messaging;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public interface Message {

  public static int REGISTRATION_MESSAGE = 3;
  public static int registration_Response = 4;
  public static int  de_Registration_Message = 5;
  public static int  request_Registered_users = 6;
  public static int  response_Registered_Users = 7;
  public static int  broadcast_Message = 8;
  public static int whisper_Message = 9;


}
