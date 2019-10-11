
public class Video extends MediaItem{

	private String director;
    private String genre;
    private String year;
	public Video(int bookId, String title, int noOfCopies) {
		super(bookId, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
    public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
    
}
