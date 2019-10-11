
public abstract class MediaItem extends Item{
 
	
	public MediaItem(int bookId, String title, int noOfCopies) {
		super(bookId, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	private int runtime;
}
