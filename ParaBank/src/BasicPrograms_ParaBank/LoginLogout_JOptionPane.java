package BasicPrograms_ParaBank;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout_JOptionPane {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		
		String un= JOptionPane.showInputDialog("Enter Username");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Swati");
		Thread.sleep(2000);
		
		String pd=JOptionPane.showInputDialog("Enter Password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Coke@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
