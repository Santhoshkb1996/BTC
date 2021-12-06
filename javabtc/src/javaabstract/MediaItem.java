package javaabstract;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int identification_num,int no_of_copy,String title,int runtime) {
		super(identification_num,no_of_copy,title);
		this.runtime = runtime;
	}

	public MediaItem() {
		super();
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public void showDetails()
	{
		super.showItem();
		System.out.println("Runtime="+runtime);
	}
	

}
