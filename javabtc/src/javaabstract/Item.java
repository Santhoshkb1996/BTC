package javaabstract;

public abstract class Item {
	private int identification_num;
	private int no_of_copy;
	private String title;
	
	public Item() {
		super();
	}
	public Item(int identification_num, int no_of_copy, String title) {
		super();
		this.identification_num = identification_num;
		this.no_of_copy = no_of_copy;
		this.title = title;
	}
	public int getIdentification_num() {
		return identification_num;
	}
	public void setIdentification_num(int identification_num) {
		this.identification_num = identification_num;
	}
	public int getNo_of_copy() {
		return no_of_copy;
	}
	public void setNo_of_copy(int no_of_copy) {
		this.no_of_copy = no_of_copy;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public abstract void showDetails();
	@Override
	public String toString() {
		return "Item [identification_num=" + identification_num + ", no_of_copy=" + no_of_copy + ", title=" + title
				+ "]";
	}
	public void showItem()
	{
		System.out.println("Identification No"+identification_num );
		System.out.println("No_of_copies"+no_of_copy );
		System.out.println("Title"+title );
	}
	
	

}
