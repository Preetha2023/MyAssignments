package week3.day1.assignments;


public class Students {
	public void  getStudentInfo(int id)
	{
		//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
		System.out.println("id" + id);
		
	}

	public void  getStudentInfo(int id,String name)
	{
		System.out.println("id" + id+ "name" +name);
		
	}
	
	public void  getStudentInfo(int id,String name, String email, long phoneNumber)
	{
		
		System.out.println("id " + id + " "+ "name " + name +" mail "+ email + " "+ "phone " +  phoneNumber);
	}
	
	public static void main (String[] args)
	{
		Students obj=new Students();
		obj.getStudentInfo(100);
		obj.getStudentInfo(101, "Preetha");
		obj.getStudentInfo(102, "Testleaf", "test@testing.com", 902233121);
		
	}
}


