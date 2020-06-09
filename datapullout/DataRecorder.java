package datapullout;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

public class DataRecorder {
	private static DataRecorder Instance = new DataRecorder();
	
	private ArrayList<String> data= null;
	private  DataRecorder() {
		
	
	}
	public static DataRecorder getInstance() {
		return Instance;
	}
	public ArrayList<String> getData() {
		
			return data=new ArrayList<> (Arrays.asList(SocketDevice.getInstance().getText().split("*",10)));

			
	}

	
	

}
