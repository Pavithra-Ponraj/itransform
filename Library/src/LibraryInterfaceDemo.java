
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TestCase1");  //Testcase1 
		System.out.println("---------");
          KidUsers kid = new KidUsers();
          kid.registerAccount(10);
          kid.registerAccount(18);
          System.out.println("");
          
          KidUsers kid1 = new KidUsers(); 
          kid1.registerBook("Fiction");
          kid1.registerBook("Kids");
          System.out.println("");
          
          System.out.println("TestCase2");  //Testcase2
    	  System.out.println("---------");
          AdultUser adult= new AdultUser();
          adult.registerAccount(5);  
          adult.registerAccount(23);
          
          System.out.println("");
          AdultUser adult1= new AdultUser();
          adult1.registerBook("Kids");
          adult1.registerBook("Fiction");
	}

}
