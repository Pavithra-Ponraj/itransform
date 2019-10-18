package javaAssignments;

import java.util.Arrays;

public class ArraySearch {
	
	public static void check(Integer [] array,int search)
	{
		
		boolean check = Arrays.asList(array).contains(search); 

        System.out.println();
  		System.out.println( search + " present in the array :- " + check);
	}

	public static void main(String[] args) 
	{
		Integer [] array = {1,4,2,5,7,3,4,2,1,4,6,0};
		int search = 7;             //number to be checked
		
          System.out.println("Array : " + Arrays.toString(array));
          check(array,search);
	}

}
