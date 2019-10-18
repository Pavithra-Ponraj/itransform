package javaAssignments;

import java.util.Arrays;

public class BubbleSort {
	
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1;i++)
			for (int j=0 ; j<n-i-1; j++)
			if(arr[j]>arr[j+1])
			{
				int temp =arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =temp;
			}
	}
		void printArray(int [] arr) {
			int n = arr.length;
			for (int i=0; i<n ;i++)
				System.out.println(arr[i]+ " ");
			System.out.println();
		}
	
	public static void main(String[] args) {
		 
		BubbleSort ob = new BubbleSort();
		int [] arr = {2,5,3,7,4,9,0,1};
		System.out.println("Before Sorting");
		System.out.println("**************");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		ob.bubbleSort(arr);
		System.out.println("After Sorting");
		System.out.println("**************");
		ob.printArray(arr);

	}

}
