package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		Arrays.sort(data); //2,3,4,6,7,11
		int x= data[4];
		System.out.println("The second largest number is "+ x);
		
		
	}
	
	

}
