package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		Thread.sleep(1000);
		
		//8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Suganya");
		System.out.println("First name entered");
	//	 9	Click Find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Find leads clicked");
		Thread.sleep(1000);
		
		// 10 Click on first resulting lead
		WebElement lead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		System.out.println(lead);
		lead.getText();
		lead.click();
		//11 Verify title of the page
		String title=driver.getTitle();
		System.out.println(title);
		//12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		System.out.println("Edit button clicked");
		
		//13 Change the company name
		WebElement comp = driver.findElement(By.id("updateLeadForm_companyName"));
		comp.clear();
		comp.sendKeys("Newcompanyname");
		System.out.println("Company name changed");
		//14 Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Update button clicked");
		//15 Confirm the changed name appears
		if(driver.findElement(By.id("viewLead_companyName_sp"))==comp)
			
		{
			System.out.println("Company name changed");
		}
		else
		{
			System.out.println("Company name not changed");
		}
		//16 Close the browser (Do not log out)
		driver.close();
		


	}

}
