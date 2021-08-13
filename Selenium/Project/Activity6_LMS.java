package seleniumprojectLMS;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity6_LMS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");
		 WebElement Myaccount= driver.findElement(By.xpath("//a[text()='My Account']"));
		 Myaccount.click();
		 String ActualTitle= driver.getTitle();
		 String ExpectedTitle="My Account – Alchemy LMS"; 
		 Assert.assertEquals(ActualTitle,ExpectedTitle);
		 WebElement Login= driver.findElement(By.xpath("//a[@href='#login']"));
		 Login.click();
		 WebElement username=driver.findElement(By.xpath("//*[@id='user_login']"));
		 username.sendKeys("root");
		 WebElement password=driver.findElement(By.xpath("//*[@id='user_pass']"));
		 //String pass="​pa$$w0rd";
		 password.sendKeys("pa$$w0rd");
		 WebElement submit=driver.findElement(By.xpath("//*[@id='wp-submit']"));
		 submit.click();
		 try{
			 driver.findElement(By.xpath("//li/a/img"));
			 //Since, no exception, so element is present
			 System.out.println("User able to Login");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("User Not able to Login");
			}
				 
		 driver.close();

	}
}