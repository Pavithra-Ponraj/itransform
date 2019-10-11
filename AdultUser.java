
public class AdultUser implements LibraryUser {

	int age;
	String bookType;
	
	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		if(age>12) {
			System.out.println("You have successfully registered under Adult account");
		}
		else {
			System.out.println("Sorry, age must be greater than 12 to register as a Adult");
		}
	}

	@Override
	public void registerBook(String bookType) {
		// TODO Auto-generated method stub
		if(bookType=="Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops!you are allowed to take only Adult fiction books"); 
		}
	}

	
	
}
