package seleniumprojectLMS;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity9_LMS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");
		 
		 WebElement Myaccount= driver.findElement(By.xpath("//a[text()='My Account']"));
		 Myaccount.click();

		 WebElement Login= driver.findElement(By.xpath("//a[@href='#login']"));
		 Login.click();
		 
		 WebElement username=driver.findElement(By.xpath("//*[@id='user_login']"));
		 username.sendKeys("root");
		 
		 WebElement password=driver.findElement(By.xpath("//*[@id='user_pass']"));
		 password.sendKeys("pa$$w0rd");	
		 
		 WebElement submit=driver.findElement(By.xpath("//*[@id='wp-submit']"));
		 submit.click();
		 
		 
		 WebElement Course= driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/']"));
		 Course.click();
		 
		 
		 WebElement Course1= driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/lessons/developing-strategy/']"));
		Course1.click();
		 
		 
		 WebElement CourseTitle=driver.findElement(By.xpath("//div[@class='ld-focus-content']/h1"));
		 String courseheading=CourseTitle.getText();
	     String expectedTitle="Developing Strategy";		 
		 Assert.assertEquals(courseheading,expectedTitle);
		 
		 try{
			 
			 if (driver.findElement(By.xpath("//a/span[text()='Mark Complete']")).isDisplayed());
			 		{driver.findElement(By.xpath("//a/span[text()='Mark Complete']")).click();}
			 //Since, no exception, so element is present
			// System.out.println("User able to Complete");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("The Course is already Completed");
			}
				
	     driver.close();
		 
	}
}