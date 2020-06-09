package datainput;

import java.util.Date;
import java.util.Locale;

import org.apache.poi.ss.usermodel.DateUtil;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
public class UploadData implements Observer, UpdateData {

    public ServerSocket server;
    public int port = 9998;
	 String gunluktestsayisi, gunlukvakasayisi, yogunbakimdakihasta, entubehastasayisi, olusayisi, iyilesenkisi, bugun;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
   
	
	

	
	@Override
	public void update(String gunluktest, String vaka, String yogunbakimhasta, String entubehasta, String olu,
			String iyilesme, Date g�n) {
		this.gunluktestsayisi=gunluktest;
		this.gunlukvakasayisi=vaka;
		this.yogunbakimdakihasta=yogunbakimhasta;
		this.entubehastasayisi=entubehasta;
		this.olusayisi=olu;
		this.iyilesenkisi=iyilesme;
		
		this.bugun=dateFormat.format(g�n)	;
		try {
		server = new ServerSocket(port);
		System.out.println("Waiting for the client request");
		
            //creating socket and waiting for client connection
		 
			Socket socket = server.accept();
           
            System.out.println("connected");
         
          	
            		 
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("G�nl�k Test Say�s�="+gunluktestsayisi +"-"+"\nG�nl�k Vaka Say�s�="+gunlukvakasayisi+"-"+"\nYo�un Bak�mdaki Hasta Say�s�="+yogunbakimdakihasta
            		+"-"+"\nEnt�be Hasta Say�s�="+entubehastasayisi+"-"+"\n�l� Say�s�="+olusayisi+"-"+"\n�yile�en Ki�i Say�s�="+iyilesenkisi
            		+"-"+"\nG�ncelleme Tarihi="+bugun
            		
            		);
         
            oos.close();}
		catch(Exception e){
			System.out.println(e);
		}
		updatedata();
		
		
		// TODO Auto-generated method stub
		
	}



	public void updatedata() {
	
		
		try {
			new Thread().start();
			server = new ServerSocket(port);
			System.out.println("Waiting for the client request");
			
	            //creating socket and waiting for client connection
			 
				Socket socket = server.accept();
	           
	            System.out.println("connected");
	         
	            while(true) {
	            	
	            		 
	            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	            oos.writeObject("G�nl�k Test Say�s�="+gunluktestsayisi +"*"+"\nG�nl�k Vaka Say�s�="+gunlukvakasayisi+"*"+"\nYo�un Bak�mdaki Hasta Say�s�="+yogunbakimdakihasta
	            		+"*"+"\nEnt�be Hasta Say�s�="+entubehastasayisi+"*"+"\n�l� Say�s�="+olusayisi+"*"+"\n�yile�en Ki�i Say�s�="+iyilesenkisi
	            		+"*"+"\nG�ncelleme Tarihi="+bugun
	            		
	            		);
	         
	            
	            oos.close();
	            server.close();
	            
	           
	            }
	       
	           
		
	            		
		}
	            	
		
				catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
		

			
	
		}}
		


