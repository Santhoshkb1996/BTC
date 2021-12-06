package javabtc;

public class EncapMod {
	private int regno;
	private String model;
	private int no_of_seat;
	public int getRegno()
	{
	return regno;	
	}
	public String getModel()
	{
		return model;
	}
	public int getSeat()
	{
		return no_of_seat;
	}
	
	public void setRegno(int newregno)
	{
		regno=newregno;
	}
	public void setModel(String newmodel)
	{
		model=newmodel;
	}
	public void setSeat(int newSeats)
	{
		no_of_seat=newSeats;
	}	

}
