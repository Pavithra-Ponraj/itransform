
public class JournalPaper extends WrittenItem{
    
	private int yearOfPublish;
	public JournalPaper(int bookId, String title, int noOfCopies) {
		super(bookId, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
}
