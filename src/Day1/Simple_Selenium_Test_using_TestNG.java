package Day1;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Selenium_Test_using_TestNG {
	
	//Use safari Browser
	SafariDriver driver;
	String url;
	String expect;
	String actual;
	boolean status;

	
	@BeforeTest
	public void before() {
		driver = new SafariDriver();

		System.out.print("Start Test Login Method");
		url = "https://www.facebook.com";
		expect = "The email you entered isn’t connected to an account. Find your account and log in.";
	}

  @Test
  public void login()throws InterruptedException  {
	  driver.get(url);
	    driver.manage().window().setPosition(new Point(0,0));
	    driver.manage().window().setSize(new Dimension(600,800));
	    
	    driver.findElement(By.cssSelector("input#email")).sendKeys("Ra@r.com");
		Thread.sleep(1000);

	    driver.findElement(By.cssSelector("input#pass")).sendKeys("1144");
		Thread.sleep(1000);

	    driver.findElement(By.cssSelector("button[id*='u_0_5_']")).click();
	    
		Thread.sleep(50000);
	    actual = driver.findElement(By.cssSelector("._9ay7")).getText();
	    





  }
  
	@AfterTest
	public void after() throws InterruptedException {

		 Assert.assertEquals(actual, expect,"Error message not Equal..");

		System.out.print("Finish Test Login Method");
		
		Thread.sleep(5000);
		driver.close();
	}
}
