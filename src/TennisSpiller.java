
public class TennisSpiller implements Runnable {
	private TennisSpiller modstander;
	private String name;
	
	
	public TennisSpiller(String name) {
		this.name = name;
	}

	void setModstander(TennisSpiller modstander) {
		this.modstander = modstander;
		
	}
	
	public void run() {
		try {
			Thread.sleep((long) (1000 + 1000 * Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Math.random() > .05) {
			System.out.println(name + " fik bolden");
			modstander.modtagBold(new Thread(modstander));
		}
		else {
			System.out.println(name + " tabte bolden");
		}
		
	}
	
	void modtagBold(Thread skud) {
		skud.start();
	}
}
