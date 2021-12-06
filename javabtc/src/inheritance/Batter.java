package inheritance;

public class Batter extends Player{

	private int totalRun;
	private int centuries;
	private float strikeRate;
	
	public Batter() {
		//super();
		System.out.println("From Default Batter Constructor");
	}
	
	
	
	public Batter(String playerName, int serialNo, int age, int totalRun, int centuries, float strikeRate) {
		super(playerName,serialNo,age);
		this.totalRun = totalRun;
		this.centuries = centuries;
		this.strikeRate = strikeRate;
	}



	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public float getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}
	
	
	public void showPlayerDetails() {
		super.showPlayerDetails();
		System.out.println("Total Runs - "+totalRun);
		System.out.println("Centuries - "+centuries);
		System.out.println("Strike Rate - "+strikeRate);
	}
	
	
}