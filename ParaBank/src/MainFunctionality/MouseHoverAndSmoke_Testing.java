package MainFunctionality;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndSmoke_Testing {


			public static void main(String[] args) throws Exception
		         {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				

		driver.get("https://www.parasoft.com/industries/");
		

		Actions a = new Actions(driver);
		List<WebElement>ls = driver.findElements(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));

		int size = ls.size();
		System.out.println("No of elements: "+size);

		for(int i=1; i<=size; i++)
		{
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div/div/div/span//ul/li["+i+"]")).getText());
			Thread.sleep(2000); 
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-header-menu\"]/li[2]/a["+i+"]"))).click().perform();
			Thread.sleep(2000); 
		    
		}
		driver.navigate().back();
		Thread.sleep(1000); 
		driver.quit();

	}

}
