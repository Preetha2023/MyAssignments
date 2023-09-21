package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input=13;
		
		// Declare a boolean variable flag as false

		boolean flag=true;

		// Iterate from 2 to half of the input

		for (int i = 2; i <input ; i++) {
			
			if (input % i==0) {
				
				flag= false;
				
				} 
		
		}
			if (flag)
			{
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
			
		}


			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 
		




}
