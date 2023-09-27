package DDT_Frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DDT_POI {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream file = new FileInputStream(
				"C:\\Users\\sukhendra\\Documents\\Automation\\Data_File.xlsx");

		// JVM will reach to Excel File
		XSSFWorkbook w = new XSSFWorkbook(file);
		// Decide unique Excel Sheet
		XSSFSheet s = w.getSheet("Read");
		// To Store Total Number of Row
		int rowsize = s.getLastRowNum();
		System.out.println("No of credential: " + rowsize);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhendra\\Documents\\Automation\\BrowserExtension\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		// Create Object of POM Class
		DDTOperationalClass_POI o = new DDTOperationalClass_POI();
		// for loop
		for (int i = 1; i <= rowsize; i++) {
			// Store username and Password in Variable
			String usn = s.getRow(i).getCell(0).getStringCellValue();
			String pwd = s.getRow(i).getCell(1).getStringCellValue();
			System.out.println(usn + "\t\t" + pwd);
			// Handle Exception
			try {
				o.maximizeBrowser(driver);
				o.url(driver);
				Thread.sleep(2000);
				o.enterUserName(driver, usn);
				Thread.sleep(2000);
				o.enterPassword(driver, pwd);
				Thread.sleep(2000);
				o.clickOnLoginButton(driver);
				Thread.sleep(4000);
				//pr.Logout(driver);
				//Thread.sleep(2000);
				System.out.println("valid Credential.");
				System.out.println("");
				s.getRow(i).createCell(2).setCellValue("valid Credential.");
			} catch (Exception e) {

				System.out.println("Invalid Credential.");
				System.out.println("");
				s.getRow(i).createCell(2).setCellValue("Invalid Credential.");
				// Write TestResult on ExcelSheet
				FileOutputStream out = new FileOutputStream(
						"C:\\Users\\sukhendra\\Documents\\Automation\\Data_File.xlsx");
				w.write(out);
			}

		}
		driver.close();
		

	}

}
