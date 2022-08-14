package Day2;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;import org.testng.Reporter; 
public class TestNG1 { 
 @Test(priority = -1) 
public void testGoogle() 
{ 
     Reporter.log("Launching safari Driver",true);
 	SafariDriver driver = new SafariDriver();
     driver.manage().window().maximize();   
     driver.get("http://google.com");    
     String title=driver.getTitle(); 
     Assert.assertEquals(title,"Google"); 
     Reporter.log("Asserted the title of Google", true); 
     driver.close();
   } 
 }
