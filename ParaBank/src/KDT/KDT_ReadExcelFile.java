package KDT;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class KDT_ReadExcelFile 
{
	public void readExcelF(WebDriver driver) throws Exception
	{
		FileInputStream file= new FileInputStream("C:\\Users\\sukhendra\\Documents\\Automation\\Data_File.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(file);
		XSSFSheet s= w.getSheet("");
		
		int rowsize=s.getLastRowNum();
		System.out.println("No of Keywords: "+rowsize);
		KDTOperationalClass kdto=new KDTOperationalClass();
		
		for(int i=1;i<=rowsize;i++)
		{
			String key=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);
			
			if(key.equals("OpenURL"))
			{
				kdto.url(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("MaximizeBrowser"))
			{
				kdto.maximizeBrowser(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("Enter Username"))
			{
				kdto.enterUserName(driver, "Admin");
				Thread.sleep(2000);
			}
			else if(key.equals("Enter password"))
			{
				kdto.enterpassword(driver, "admin@123");
				Thread.sleep(2000);
			}
			else if(key.equals("ClickOnLoginButton"))
			{
				kdto.clickOnLoginButton(driver);
				Thread.sleep(2000);
			}
			
			else if(key.equals("CloseBrowser"))
			{
				kdto.closeBrowser(driver);
			}
		}
	}

}
