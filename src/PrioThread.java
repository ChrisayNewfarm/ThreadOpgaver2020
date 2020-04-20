
public class PrioThread implements Runnable {
	
	Thread thread;
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("Prioritet: " + thread.getPriority());
	}
	
	public void startThread(Thread thread, int priority) {
		this.thread = thread;
		thread.setPriority(priority);
		thread.start();
	}
}
