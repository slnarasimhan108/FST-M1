package seleniumprojectLMS;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity7_LMS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");
		 WebElement AllCourses= driver.findElement(By.xpath("//a[text()='All Courses']"));
		 AllCourses.click();
		 List<WebElement> links = driver.findElements(By.xpath("//h3[@class='entry-title']")); 
		 int linkCount = links.size();
		 System.out.println("Total Number of Courses on webpage = "  + linkCount);
		 driver.close();

	}
}