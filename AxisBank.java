package week3.day1.assignments;

public class AxisBank extends Bankinfo {
	public void deposit()
	{
		System.out.println("this is deposit in AxisBank");
	}

	public  static void main ( String[] args)
	{
		AxisBank obj= new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
		
	}
}
