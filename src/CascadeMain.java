
public class CascadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CascadeThread[] casThreads = new CascadeThread[10];
		CascadeThread prevThread = null;
		for (int i = 0; i < casThreads.length; i++) {
			if (i != 0) 
				prevThread = casThreads[i-1];
			
			casThreads[i] = new CascadeThread(prevThread,i+1);
			casThreads[i].startThread(new Thread(casThreads[i]));
		}
		casThreads[casThreads.length-1].startFall();
	}

}
