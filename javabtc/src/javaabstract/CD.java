package javaabstract;

public class CD extends MediaItem{
private String artist;
private String genre;
public CD() {
	super();
}
public CD(int identification_num,int no_of_copy,String title,int runtime,String artist, String genre) {
	super(identification_num,no_of_copy,title,runtime);
	this.artist = artist;
	this.genre = genre;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public void showDetails1()
{
	super.showDetails();
	System.out.println("Genre="+genre);
	System.out.println("Artist="+artist);
	
}
}
