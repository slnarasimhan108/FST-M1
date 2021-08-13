package seleniumprojectLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity2_LMS  {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/lms");
                    
        //Get the heading of the website and verify the text
        WebElement classNameLocator = driver.findElement(By.className("uagb-ifb-title-wrap"));
        System.out.println("Text displayed in first heading is: " + classNameLocator.getText());
        
        //Close the browser
        driver.close();
    }
}