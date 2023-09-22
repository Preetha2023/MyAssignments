package week1.day2.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		//sort Array
		Arrays.sort(arr); //1,2,3,4,6,7,8
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 1; i < arr.length; i++) {
			
			// check if the iterator variable is not equal to the array values respectively
			if (i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
			
		}

	}

}
