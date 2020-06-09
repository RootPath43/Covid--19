package datainput;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
		  
		try{
			InetAddress host = InetAddress.getLocalHost();
	        Socket socket = null;
	        ObjectOutputStream oos = null;
	        ObjectInputStream ois = null;
	        socket = new Socket("localhost", 9998);
            //write to socket using ObjectOutputStream
	        while(true){
	            //establish socket connection to server
	         
	            oos = new ObjectOutputStream(socket.getOutputStream());
	            System.out.println("Sending request to Socket Server");
	            
	           
	            //read the server response message
	            ois = new ObjectInputStream(socket.getInputStream());
	            String message = (String) ois.readObject();
	            System.out.println("Message: " + message);
	        
	            //close resources
	            ois.close();
	            oos.close();
	           
	        }}
		catch(Exception e ) {
			System.out.println(e);
		}
	    
	}}


