package javaAssignments;

import java.util.Scanner;

public class StudentResult
{

	public static void main(String[] args) {
		
		 int m1,m2,m3;
	        System.out.println("Ënter 3 subject marks for 100 : ");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the mark m1 : ");
	        m1 = scanner.nextInt();
	        System.out.println("Enter the mark m2 : ");
	        m2 = scanner.nextInt();
	        System.out.println("Enter the mark m3 : ");
	        m3 = scanner.nextInt();
	        scanner.close();
	      	       
	        if(m1>60 && m2>60 && m3>60) 
	        {
	            System.out.println("You are Passed...!");
	        }
	        else if((m1>60 && m2>60 &&m3<60) || (m1>60 && m2<60 &&m3>60) || (m1<60 && m2>60 &&m3>60)) 
	        { 	
	            System.out.println("You are Promoted..."); 
	        }
	        else if((m1>60 && m2<60 &&m3<60) || (m1<60 && m2<60 &&m3>60) || (m1<60 && m2>60 &&m3<60)) 
	        {
	        	 System.out.println("You are Failed...");
	        }
	}
	
}
