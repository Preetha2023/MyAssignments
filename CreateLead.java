package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	private static WebElement findElement;

	public static void main(String[] args) {
		//	1. Launch URL "http://leaftaps.com/opentaps/control/login"

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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//   4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Leads Button

		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Leads link is clicked");

		//   6. Click on create Lead Button

		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create Lead button is clicked");

		//	   7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf2023");

		//   8. Enter FirstName using id Locator

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test11");

		//  9. Enter LastName using id Locator

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test22");
		
		System.out.println("Firstname,LastName and Company name is entered");

		//	   10. Select value as Employee in Source Using SelectbyVisible text
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd=new Select(source);
		sourcedd.selectByVisibleText("Employee");
		System.out.println("Employee in Source");

	//	11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement marketingcampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketing=new Select(marketingcampaign);
		marketing.selectByValue("9001");
		System.out.println("Pay Per Click Advertising in MarketingCampaign");


	//	13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		
		WebElement Corporation = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select corp=new Select(Corporation);
		corp.selectByIndex(5);
		System.out.println("Ownership is selected as Corporation");

	//	14. Select value as India in Country Field Using SelectbyVisibletext
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		System.out.println("Country is selected as India");

	//	15. Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Create Lead button is clicked");

//		16. Get the Title of the resulting Page
		String resultingpagetitle = driver.getTitle();
		System.out.println(resultingpagetitle);
		System.out.println("New Lead is created ");
		
		driver.close();

	}

}
