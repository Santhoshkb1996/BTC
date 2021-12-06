package javaabstract;

public class JournalPaper extends WrittenItem {
	private int yop;
	
	public JournalPaper() {
		super();
	}

	public JournalPaper(int identification_num,int no_of_copy,String title,String author,int yop) {
		super(identification_num,no_of_copy,title,author);
		this.yop = yop;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Year of publish="+yop);
		
	}
}
