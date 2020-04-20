
public class PrioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrioThread prioThread;
		for ( int i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++ ) {
			prioThread = new PrioThread();
			prioThread.startThread(new Thread(prioThread), i);
		}
	}

}
