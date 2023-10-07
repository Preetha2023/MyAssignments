package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main( String[] args)
	{
	String test = "changeme";
	char[] charArray = test.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		if(i%2==0)
		{
		char uppercase=	Character.toUpperCase(charArray[i]);
		System.out.print(uppercase);
		}
		else
		{
			System.out.print(charArray[i]);
		}
	}
			

}
}

