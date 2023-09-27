package MainFunctionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AboutUs 
{
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws Exception
	{
System.setProperty("WebDriver.webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  }
	
  @Test
  public void f() throws Exception
  {
	 driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a"));
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
	 Thread.sleep(3000);
	  
}
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
