package KDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KDTMainClass {
	WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		System.setProperty("WebDriver.webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
		KDT_ReadExcelFile  r= new KDT_ReadExcelFile ();
		r.readExcelF(driver);

	}

}
