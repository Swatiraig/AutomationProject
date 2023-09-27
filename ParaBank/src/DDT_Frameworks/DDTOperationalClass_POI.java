package DDT_Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DDTOperationalClass_POI 
{
	public void url(WebDriver driver) {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void enterUserName(WebDriver driver,String usn) {
		driver.findElement(By.name("username")).sendKeys(usn);
	}
	public void enterPassword(WebDriver driver,String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	public void clickOnLoginButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	
	public void closeBrowser(WebDriver driver) {
		driver.close();

}

}
