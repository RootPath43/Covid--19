package datapullout;



import java.util.Vector;



public class DataFeed implements Subject {

	String gunluktest=DataRecorder.getInstance().getData().get(0);
	String vaka =DataRecorder.getInstance().getData().get(1);
	String yogunbakimhasta=DataRecorder.getInstance().getData().get(2);
	String entubehasta=DataRecorder.getInstance().getData().get(3);
	String olu=DataRecorder.getInstance().getData().get(4);
	String iyilesme=DataRecorder.getInstance().getData().get(5);
	String gün=DataRecorder.getInstance().getData().get(6);

	private Vector<Observer> observers;
	public DataFeed() {
		observers = new Vector<Observer>();
	}
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	public void removerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		
		for (Observer observer: observers) {
			observer.retrieve(gunluktest, vaka, yogunbakimhasta, entubehasta, olu, iyilesme, gün);
		}
	}
	

}
