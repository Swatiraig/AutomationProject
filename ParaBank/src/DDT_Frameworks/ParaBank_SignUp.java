package DDT_Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank_SignUp 
{
	public void maximizeBrowser(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
	}
	
	public void enterFirstName(WebDriver driver,String firstname)
	{
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("firstname");
	}
	public void enterLastName(WebDriver driver, String lastName)
	{
		driver.findElement(By.xpath("//input[@id='customer.laststName']")).sendKeys("lastname");
	}
	public void enterAddress(WebDriver driver, String address)
	{
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("address");
	}
	public void enterCity(WebDriver driver , String city)
	{
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("City");
	}
	public void enterState(WebDriver driver, String state)
	{
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("State");
		
	}
	public  void  enterZipCode(WebDriver driver, int string)
	{
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("zipCode");
	}
	public void enterPhoneNumber(WebDriver driver , long phoneNumber)
	{
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("Phonenumber");
	}
	public void enterSSNNumber(WebDriver driver, int SSNNumber)
	{
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("SSN");
	}
	public void enterUserName(WebDriver driver , String usn)
	{
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Swati");
	}
	public void enterPassword(WebDriver driver , String pwd)
	{
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Coke@1234");
	}
	public void enterConfirmPassword(WebDriver driver , String Confirmpwd)
	{
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Coke@1234");
	}
	public void ClickOnRegisterButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void ClickOnLogOutButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
	}
	public void CloseBrowser(WebDriver driver)
	{
		driver.close();
	}
	 

}
