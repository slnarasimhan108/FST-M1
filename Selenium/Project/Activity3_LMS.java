package seleniumprojectLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.openqa.selenium.WebElement;

public class Activity3_LMS  {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/lms");
                    
        String ActualTitle= driver.findElement(By.xpath("//div[@class='uagb-ifb-title-wrap']/h3")).getText();
		 System.out.println("The title of the first info box  is : " + ActualTitle);
		 //String ActualHeading= driver.getTitle();
		 String ExpectedTitle="Actionable Training"; 
		  
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	      driver.close();
    }
}
