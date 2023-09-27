package BasicPrograms_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLAndTitle_Verfication 
{

	public static void main(String[] args) throws  Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//URL Verification...
		String actualUrl=driver.getCurrentUrl();
		
		if(actualUrl.equals("https://para.testar.org/parabank/index.htm"))
		{
			System.out.println("Verification Successful-The Correct URL is opened.");
		}
		else
		{
			System.out.println("Verification Failed-An incorrect URL is opened.");
		}
		Thread.sleep(2000);
		
		// Title Verification...
		
		
		

	}

}
