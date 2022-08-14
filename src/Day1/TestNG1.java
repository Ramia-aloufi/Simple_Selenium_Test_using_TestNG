package Day1;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
	SafariDriver driver = new SafariDriver();

  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.get("http://google.com");
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"Google");
  }
}
