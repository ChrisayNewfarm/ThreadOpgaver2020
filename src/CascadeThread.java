
public class CascadeThread implements Runnable{

	private boolean fall;
	private CascadeThread next;
	private int number;
	
	public CascadeThread(CascadeThread next, int number) {
		this.next = next;
		this.number = number;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(!fall) {
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("Domino " + number + " har faldt!");
		if (next != null) next.startFall();
	}
	public void startThread(Thread thrd) {
		thrd.start();
	}
	public void startFall() {
		fall = true;
	}
}
