package seleniumprojectLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity4_LMS {

	public static void main(String[] args) {

		 WebDriver driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");
		 String ActualTitle= driver.findElement(By.xpath("//div/div/div[2]/article/div[2]/h3")).getText();
		 System.out.println("The title of the Second info box  is : " + ActualTitle);
		// String ActualHeading= driver.getTitle();
		 String ExpectedTitle="Email Marketing Strategies"; 
		  
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	      driver.close();


	}

}
