package datapullout;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDevice {
	 private static final SocketDevice instance= new SocketDevice();
	 private Socket socket= null;
	 private String message;
	 ObjectOutputStream oos = null;
     ObjectInputStream ois = null;
	 private SocketDevice(){
		 try {
			InetAddress host = InetAddress.getLocalHost();
		     socket = new Socket("localhost", 9998);
		     oos = new ObjectOutputStream(socket.getOutputStream());
	           System.out.println("Sending request to Socket Server");
	           ois = new ObjectInputStream(socket.getInputStream());
	           setText((String) ois.readObject());
	           oos.close();
	           ois.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	 }
	 public static SocketDevice getInstance( ) {
         return instance;
    }
	 public void setText(String text) {
	
	          
		this.message=text;
		
			// TODO Auto-generated catch block
		
		
	 }
	 public String getText() {
		 return message;
	 }
	
	
}
