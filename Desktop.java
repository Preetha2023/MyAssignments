package week3.day1.assignments;

public class Desktop extends Computer{

	public void DesktopSize()
	{
		System.out.println("Desktop size");
	}
	public static void main(String[]args)
	{
		Desktop obj= new Desktop();
		obj.computerModel();
		obj.DesktopSize();
	}
}


