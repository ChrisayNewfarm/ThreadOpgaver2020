
public class TennisMain {
	public static void main(String[] args) {
		TennisSpiller spiller1 = new TennisSpiller("Mark");
		TennisSpiller spiller2 = new TennisSpiller("Chris");
		
		spiller1.setModstander(spiller2);
		spiller2.setModstander(spiller1);
		
		spiller1.modtagBold(new Thread(spiller1));
	}
}
