package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println("LeafTaps page is opened");

		//   2. Enter UserName and Password Using Id Locator

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");


		//   3. Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Username, password is entered ");
		System.out.println("Login button is clicked");

		//   4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//  5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println("Accounts button is clicked");

		//	   6. Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		System.out.println("Create Accounts link is clicked");

		//   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account

		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		System.out.println("Debit Limited Account is input for Account Name");

		//   8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		System.out.println("Selenium Automation Tester is entered in description");

		//   9. Enter LocalName Field Using Xpath Locator

		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Localname");
		System.out.println("Local name field entered");

		//   10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Site1");
		System.out.println("Site name is entered");

		//  11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute

		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1500");
		System.out.println("Annual revenue field entered as 1500");

		//   12. Select Industry as ComputerSoftware

		WebElement industry= driver.findElement(By.name("industryEnumId"));
		Select ind= new Select(industry);
		ind.selectByIndex(3);
		System.out.println("Industry is selected as Computer software");

		//   13. Select OwnerShip as S-Corporation using SelectByVisibletext

		WebElement Ownership= driver.findElement(By.name("ownershipEnumId"));
		Select own= new Select(Ownership);
		own.selectByVisibleText("S-Corporation");
		System.out.println("Ownership is selected as S-Corporation");

		//   14. Select Source as Employee using SelectByValue
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select source1= new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		System.out.println("Source is selected as Employee");

		//	   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex

		WebElement marketing= driver.findElement(By.id("marketingCampaignId"));
		Select mkn=new Select(marketing);
		mkn.selectByIndex(6);
		System.out.println("Marketing campaign is selected as ecommerce site");

		//	   16. Select State/Province as Texas using SelectByValue 

		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st=new Select(state);
		st.selectByValue("TX");
		System.out.println("State/province selected as Texas");

		//   17. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.out.println("Create Account button is clicked");
		System.out.println("Account is created successfully");
		driver.close();
	}

}
