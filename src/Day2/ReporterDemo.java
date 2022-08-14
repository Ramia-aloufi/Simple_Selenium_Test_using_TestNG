package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ReporterDemo {  
 @Test public void testReport()
{  
	SafariDriver driver = new SafariDriver();
    Reporter.log("Browser Opened");  
    driver.manage().window().maximize(); 
    Reporter.log("Browser Maximized");   
    driver.get("http://www.google.com");  
    Reporter.log("Application started"); 
    driver.quit();     
    Reporter.log("Application closed");      }
}
