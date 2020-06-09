package datainput;

import javax.swing.JFrame;

public class Runner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerilerinGirildigiProgram frame= new VerilerinGirildigiProgram();
		UploadData deneme= new UploadData();
        Datafeed  data= new Datafeed();
	      data.addObserver(deneme);
	      data.notifyObserver();
	      data.removeObserver(deneme);
	      
	
  
   
      
    	}

}
