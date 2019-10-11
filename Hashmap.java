import java.util.*;
import java.util.Map.Entry; 
  
public class Hashmap { 
   
	public static void main(String[] args)    
   {
// 			Hashmap creation
     HashMap<Long, String> Contacts = new HashMap<Long, String>();  
		{
			
//		Existing contact list
        Contacts.put(9632543545L, "xxxx"); 
        Contacts.put(9546987449L, "ssss"); 
        Contacts.put(9569871235L, "rrrr"); 
        Contacts.put(9896547853L, "aaaa"); 
        Contacts.put(9596321475L, "cccc");
        Contacts.put(9599321475L, "uuuu");
     
    // adding contacts to the existing contact list
        Scanner s = new Scanner(System.in);        
        System.out.println("Enter the number of contacts You wanted to add :");
        int num = s.nextInt();
        for(int i=0;i<num;i++) 
        {
        	System.out.println("Enter PhoneNumber");
        	Long ph = s.nextLong();
        	System.out.println("Enter the Name: ");
        	String name = s.next();       	
        	Contacts.put(ph, name);          	
        }
        
//  	Display contact list
        for (Entry<Long, String> entry : Contacts.entrySet()) 
        {
            String key = entry.getKey().toString();
           String value = entry.getValue();
           System.out.println("PhoneNumber : " + key + "  " + " Name:  " + value);
        }
               
//        Delete the contact specified
       
           System.out.println("Enter the contact number to remove from the list?");
        	long delete = s.nextLong();
        	Contacts.remove(delete);        	
         	
//        	Display the contact list after deletion
        	 for (Entry<Long, String> entry : Contacts.entrySet()) 
             {
                 String key = entry.getKey().toString();
                String value = entry.getValue();
                System.out.println("PhoneNumber : " + key + "  " + " Name:  " + value);
             }
        	 
//        	 Size of the ContactList
        	 System.out.println("Number of Contacts in list : " + Contacts.size());      
		}
    }
}

	


