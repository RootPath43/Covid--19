package datainput;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Datafeed  implements Subject {
	
	String gunluktest=VerilerinGirildigiProgram.getTest();
	String vaka=VerilerinGirildigiProgram.getVaka();
	String yogunbakimhasta=VerilerinGirildigiProgram.getYogunbakimhasta();
	String entubehasta=VerilerinGirildigiProgram.getEntubehasta();
	String olu=VerilerinGirildigiProgram.getOlu();
	String iyilesme=VerilerinGirildigiProgram.getIyilesen();
	Date gün=VerilerinGirildigiProgram.gün;
	private Vector<Observer> observers;
	public Datafeed() {
		observers = new Vector<Observer>();
	}
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
	
		for (Observer observer: observers) {
			observer.update(gunluktest, vaka, yogunbakimhasta, entubehasta, olu, iyilesme, gün);
			
		}
	}

}
