package inheritance;

public class Player {

	protected String playerName;
	
	protected int serialNo;
	
	protected int age;
	
	
	public Player() {
		System.out.println("From Default Player Constructor");
	}
	
	
	
	
	public Player(String playerName, int serialNo, int age) {
		this.playerName = playerName;
		this.serialNo = serialNo;
		this.age = age;
	}




	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getSerialNo() {
		return serialNo;
	}



	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void showPlayerDetails() {
		System.out.println("Player Name - "+playerName);
		System.out.println("Serial No. - "+serialNo);
		System.out.println("Age - "+age);
	}
	
	
}
