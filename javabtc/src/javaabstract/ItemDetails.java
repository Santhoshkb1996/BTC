package javaabstract;

public class ItemDetails extends Item{
	public ItemDetails(int identification_num,int no_of_copy,String title)
	{
		super(identification_num,no_of_copy,title);
	}
	public void showDetails()
	{
		super.showItem();
		//System.out.println("Identification No"+identification_num );
		//System.out.println("No_of_copies"+no_of_copy );
		//System.out.println("Title"+title );
		
	}

}
