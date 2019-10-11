
public class Cd extends MediaItem {

	private int year;
	private String genre;
	public Cd(int bookId, String title, int noOfCopies) {
		super(bookId, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
