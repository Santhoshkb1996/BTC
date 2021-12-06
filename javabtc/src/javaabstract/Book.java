package javaabstract;

public class Book extends WrittenItem {
	public Book(int identification_num,int no_of_copy,String title,String author) {
		super(identification_num,no_of_copy,title,author);
		//this.author = author;
	}
	public Book()
	{
		
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Book Details");
		
	}
}
