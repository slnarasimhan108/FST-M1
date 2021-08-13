package seleniumprojectLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity5_LMS {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");
		 WebElement Myaccount= driver.findElement(By.xpath("//a[text()='My Account']"));
		 Myaccount.click();
		 String ActualTitle= driver.getTitle();
		 String ExpectedTitle="My Account – Alchemy LMS"; 
		 Assert.assertEquals(ActualTitle,ExpectedTitle);
	      driver.close();
		
	}

}