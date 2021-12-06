package javaabstract;

public class Video extends MediaItem {
	private String genre;
	private String director;
	private int year;
	public Video(int identification_num,int no_of_copy,String title,int runtime,String genre, String director, int year) {
		super(identification_num,no_of_copy,title,runtime);
		this.genre = genre;
		this.director = director;
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Genre="+genre);
		System.out.println("Director="+director);
		System.out.println("YearOfPublished"+year);
		
	}

}
