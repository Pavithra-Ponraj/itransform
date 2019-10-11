
public abstract class WrittenItem extends Item {
	
	private String authorName;
	
	public WrittenItem(int bookId, String title, int noOfCopies) {
		super(bookId, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WrittenItem [authorName=" + authorName + "]";
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

}
