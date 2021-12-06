package javaabstract;

public class MainAbstarct {
	public static void main(String[] args)
	{
		//ItemDetails i=new ItemDetails(10,10,"Hello");
		//i.showDetails();
		//Item i=new Item();
		Book b=new Book(10,10,"Ramayan","Valmiki");
		b.showDetails();
		System.out.println("Journal Paper");
		JournalPaper jp=new JournalPaper(10,10,"Ramayan","Valmiki",2020);
		jp.showDetails();
		System.out.println("Video Details");
		Video v=new Video(10,10,"Ramayan",180,"pop","MichelJackson",1996);
		v.showDetails();
		System.out.println("CD Details");
		CD c=new CD(10,10,"Ramayan",180,"ABC","xyz");
		c.showDetails1();
	}

}
