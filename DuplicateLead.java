package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println("Leaftap url opened");

		//  2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("Username and password entered");
		//  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Login button clicked");
		//  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("CRM/SFA link clicked");
		//  5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Leads link clicked");
		// 6. Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create lead link clicked");
		//  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company1");
		System.out.println("Company name entered as company1");

		// 8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("first1");
		//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("last1");
		System.out.println("First name and Last name entered");
		//  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Localname");
		System.out.println("local name entered");
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dept");
		System.out.println("dept entered");
		//  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Long description");
		System.out.println("description entered");
	//	13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testing.com");
		System.out.println("email entered");
	//	14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Create button clicked");
	//	15. Get the Title of Resulting Page using driver.getTitle()
		String title1= driver.getTitle();
		System.out.println(title1);
		//16. Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println("Duplicate Lead button clicked");
	//	17. Clear the CompanyName Field using .clear() And Enter new CompanyName
	WebElement companyname=	driver.findElement(By.id("createLeadForm_companyName"));
	companyname.clear();
	companyname.sendKeys("newCompanyName");
	System.out.println("Clear and New company name entered");

	//	18.Clear the FirstName Field using .clear() And Enter new FirstName
	WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
	firstname.clear();
	firstname.sendKeys("new firstname");
	System.out.println("Clear and New first name entered");
	
	//        19.Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Create lead button clicked");
	//	20. Get the Title of Resulting Page using driver.getTitle()
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.close();

	}

}
