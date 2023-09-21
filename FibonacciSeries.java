package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range=8;
		int firstNum=0;
		int secNum=1;
		

				// Print first number
		System.out.println(firstNum);
				
		System.out.println(secNum);
				// Iterate from 1 to the range
		for (int i = 1; i <= range; i++) {
			
			int sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
				
				
		
		

	}

}
