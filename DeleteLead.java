package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		 
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
	//	7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Find Leads link clicked");
		
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		System.out.println("Phone tab is clicked");
	//	9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("90");
		System.out.println("Phone number entered");
	//	10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("FindLeads clicked");
	//	11	Capture lead ID of First Resulting lead
		String firstlead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(firstlead);
		Thread.sleep(200);
	//	12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println("First lead clicked");
		
		//13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Delete clicked");
	//	14	Click Find leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstlead);
		System.out.println("firstlead entered");
	//	16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String msg= driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(msg);
		if(msg.contains("No records to display"))
		{
			System.out.println("Text matched");
		}
		else
		{
			System.out.println("Text not matched");
		}
		
	//	18	Close the browser (Do not log out)
		driver.close();
	}

}
