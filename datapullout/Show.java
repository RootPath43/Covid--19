package datapullout;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Show extends JFrame implements Observer, Display  {
	 String gunluktestsayisi, gunlukvakasayisi, yogunbakimdakihasta, entubehastasayisi, olusayisi, iyilesenkisi, bugun;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void retrieve(String gunluktest, String vaka, String yogunbakimhasta, String entubehasta, String olu,
			String iyilesme, String gün) {
		// TODO Auto-generated method stub
		this.gunluktestsayisi=gunluktest;
		this.gunlukvakasayisi=vaka;
		this.yogunbakimdakihasta=yogunbakimhasta;
		this.entubehastasayisi=entubehasta;
		this.olusayisi=olu;
		this.iyilesenkisi=iyilesme;
		this.bugun=gün	; 
		display();
		
		
		
	}

	
	
}
