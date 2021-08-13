package seleniumprojectLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_LMS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");
		 WebElement contactus= driver.findElement(By.xpath("//a[text()='Contact']"));
		 contactus.click();
		 
		 WebElement Full_Name= driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']"));
		 Full_Name.sendKeys("Suchitra Shetty");
		 WebElement Email=driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']"));
		 Email.sendKeys("su.shetty@gmail.com");
		 WebElement subject=driver.findElement(By.xpath("//*[@id='wpforms-8-field_3']"));
		
		 subject.sendKeys("Request ");
		 WebElement message=driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']"));
		 message.sendKeys("This is Message");
		 WebElement submit = driver.findElement(By.xpath("//button[@id='wpforms-submit-8']"));
		 submit.click();
		
		 
		 WebElement msg = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p"));
		 System.out.println("The message is displayed as "+msg.getText());
		
		 driver.close();

	}

}