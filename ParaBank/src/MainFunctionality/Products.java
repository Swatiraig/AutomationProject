package MainFunctionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Products {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(5000);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  }
	  
	
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
	  Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"menu-header-menu\"]/li[1]/a")).click();
WebElement element=driver.findElement(By.xpath("//*[@id=\"menu-item-27351\"]/a"));
	  
	  //Scroll
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)");
		
		//bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(5000);
		
  }
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
