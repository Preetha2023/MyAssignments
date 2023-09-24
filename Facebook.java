package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		
				// Step 1: Download and set the path 
				// Step 2: Launch the chromebrowser
				// Step 3: Load the URL https://en-gb.facebook.com/
				// Step 4: Maximise the window
				// Step 5: Add implicit wait
				// Step 6: Click on Create New Account button
				// Step 7: Enter the first name
				// Step 8: Enter the last name
				// Step 9: Enter the mobile number
				// Step 10: Enterthe password
				// Step 11: Handle all the three drop downs
				// Step 12: Select the radio button "Female" 

				ChromeDriver driver=new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("New2023");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastname2023");
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9098765432");
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("newpwd2023");
				WebElement day = driver.findElement(By.id("day"));
				Select days=new Select(day);
				days.selectByValue("15");
				WebElement month = driver.findElement(By.id("month"));
				Select mon=new Select(month);
				mon.selectByVisibleText("Aug");
				WebElement year = driver.findElement(By.id("year"));
				Select yr=new Select(year);
				yr.selectByIndex(20);
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				System.out.println("All steps executed");
				
				
		

	}

}
