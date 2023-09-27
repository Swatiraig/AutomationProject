package BasicPrograms_ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankParasoft_SignUp {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://para.testar.org/parabank/index.htm");
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Rai");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("C114,Kalyani Nagar");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("43211");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("9893248313");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("4321");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Coke@1234");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Coke@1234");
		driver.findElement(By.xpath(" //input[@value='Register']")).click();
		Thread.sleep(2000);
		
		
		// Title verification:
		
		String expect="Parabank | Welcome To Account Services";
		String actual=driver.getTitle();
		if(expect.equals(actual))
		{
			System.out.println("Login is Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		//Logout:
		
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		

	}

}
