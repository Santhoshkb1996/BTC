package javaabstract;

public abstract class WrittenItem extends Item{
	private String author;
	public WrittenItem() {
		super();
	}

	public WrittenItem(int identification_num,int no_of_copy,String title,String author) {
		super(identification_num,no_of_copy,title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showDetails()
	{
		super.showItem();
		System.out.println("Author"+author);
		
	}
	

}
